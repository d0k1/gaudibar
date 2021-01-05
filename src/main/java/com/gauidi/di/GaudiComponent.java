package com.gauidi.di;

import com.gauidi.controllers.ChallengeController;
import com.gauidi.controllers.IndexController;
import com.gauidi.controllers.LoginController;
import com.gauidi.util.MessageBundle;
import com.gauidi.util.ViewUtil;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = GaudiModule.class)
public interface GaudiComponent {
    MessageBundle messages();
    ViewUtil viewUtils();
    IndexController indexController();
    ChallengeController challengeController();
    LoginController loginController();
}
