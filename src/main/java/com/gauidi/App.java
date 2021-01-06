package com.gauidi;

import com.gauidi.controllers.ChallengeController;
import com.gauidi.controllers.IndexController;
import com.gauidi.controllers.LoginController;
import com.gauidi.controllers.SettingsController;
import com.gauidi.di.DaggerGaudiComponent;
import com.gauidi.di.GaudiComponent;
import io.javalin.Javalin;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

import javax.inject.Inject;

import static io.javalin.apibuilder.ApiBuilder.get;

public class App {

    private ChallengeController challengeController;
    private IndexController indexController;
    private LoginController loginController;
    private SettingsController settingsController;

    @Inject
    public App(IndexController indexController, ChallengeController challengeController, LoginController loginController, SettingsController settingsController) {
        this.indexController = indexController;
        this.challengeController = challengeController;
        this.loginController = loginController;
        this.settingsController = settingsController;
    }

    public void start(){
        int port = Integer.parseInt(System.getProperty("bindPort", "8080"));
        Server server = new org.eclipse.jetty.server.Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setHost(System.getProperty("bindHost", "0.0.0.0"));
        connector.setPort(port);
        server.setConnectors(new ServerConnector[] { connector });

        Javalin app = Javalin.create(it-> {
            it.addStaticFiles("/public");
            it.asyncRequestTimeout = 10_000L;
            it.enableCorsForAllOrigins();
            it.enableWebjars();
            it.server(()->server);
            //it.enableDevLogging();
        }).start(7000);

        app.routes(() -> {
            get("/", indexController.getIndexPage());
            get("/login", loginController.getIndexPage());

            get("/settings", settingsController.getIndexPage());
            get("/settings/users", settingsController.getUsers());
            get("/settings/users/add", settingsController.addUser());
            get("/settings/users/edit", settingsController.editUser());
            get("/settings/cities", settingsController.getCities());
            get("/settings/cities/add", settingsController.addCity());
            get("/settings/cities/edit", settingsController.editCity());

            get("/challenge", challengeController.getIndexPage());
            get("/challenge/score", challengeController.getScore());
            get("/challenge/city", challengeController.getCityInfo());
            get("/challenge/cities", challengeController.getCities());
        });
    }


    public static void main(String[] args) {
        GaudiComponent component = DaggerGaudiComponent.create();

        new App(component.indexController(), component.challengeController(), component.loginController(), component.settingsController()).start();
    }
}
