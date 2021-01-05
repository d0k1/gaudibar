package com.gauidi.util;

import io.javalin.http.Context;
import io.javalin.http.ErrorHandler;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

public class ViewUtil {
    MessageBundle msg;

    @Inject
    public ViewUtil(MessageBundle msg){
        this.msg = msg;
    }

    public Map<String, Object> baseModel(Context ctx) {
        Map<String, Object> model = new HashMap<>();
        model.put("msg", msg);
        model.put("currentUser", null);
        return model;
    }

}
