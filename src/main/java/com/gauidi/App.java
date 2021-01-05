package com.gauidi;

import com.gauidi.controllers.ChallengeController;
import com.gauidi.controllers.IndexController;
import com.gauidi.controllers.LoginController;
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

    @Inject
    public App(IndexController indexController, ChallengeController challengeController, LoginController loginController) {
        this.indexController = indexController;
        this.challengeController = challengeController;
        this.loginController = loginController;
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
            get("/challenge", challengeController.getIndexPage());
            get("/login", loginController.getIndexPage());
        });
    }


    public static void main(String[] args) {
        GaudiComponent component = DaggerGaudiComponent.create();

        new App(component.indexController(), component.challengeController(), component.loginController()).start();
    }
}
