package com.gauidi.controllers;

import com.gauidi.util.MessageBundle;
import com.gauidi.util.Path;
import com.gauidi.util.ViewUtil;
import io.javalin.http.Handler;
import org.eclipse.jetty.http.HttpStatus;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class SettingsController {
    MessageBundle bundle;
    ViewUtil viewUtil;

    @Inject
    public SettingsController(MessageBundle bundle, ViewUtil viewUtil) {
        this.bundle = bundle;
        this.viewUtil = viewUtil;
    }

    public Handler getIndexPage() {
        Handler handler = (ctx) -> {
            Map<String, Object> model = viewUtil.baseModel(ctx);
            ctx.render(Path.Template.INDEX, model);
        };
        return handler;
    }

    public Handler getUsers() {
        Handler handler = (ctx) -> {
            ctx.json(new HashMap());
            ctx.status(HttpStatus.OK_200);
        };
        return handler;
    }

    public Handler addUser() {
        Handler handler = (ctx) -> {
            ctx.json(new HashMap());
            ctx.status(HttpStatus.OK_200);
        };
        return handler;
    }

    public Handler editUser() {
        Handler handler = (ctx) -> {
            ctx.json(new HashMap());
            ctx.status(HttpStatus.OK_200);
        };
        return handler;
    }

    public Handler getCities() {
        Handler handler = (ctx) -> {
            ctx.json(new HashMap());
            ctx.status(HttpStatus.OK_200);
        };
        return handler;
    }

    public Handler addCity() {
        Handler handler = (ctx) -> {
            ctx.json(new HashMap());
            ctx.status(HttpStatus.OK_200);
        };
        return handler;
    }

    public Handler editCity() {
        Handler handler = (ctx) -> {
            ctx.json(new HashMap());
            ctx.status(HttpStatus.OK_200);
        };
        return handler;
    }

}
