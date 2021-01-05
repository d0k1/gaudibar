package com.gauidi.controllers;

import com.gauidi.util.MessageBundle;
import com.gauidi.util.Path;
import com.gauidi.util.ViewUtil;
import io.javalin.http.Handler;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Map;


@Singleton
public class IndexController {

    MessageBundle bundle;
    ViewUtil viewUtil;

    @Inject
    public IndexController(MessageBundle bundle, ViewUtil viewUtil) {
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
}
