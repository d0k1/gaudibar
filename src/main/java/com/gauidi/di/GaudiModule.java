package com.gauidi.di;

import com.gauidi.controllers.ChallengeController;
import com.gauidi.controllers.IndexController;
import com.gauidi.controllers.LoginController;
import com.gauidi.controllers.SettingsController;
import com.gauidi.util.MessageBundle;
import com.gauidi.util.ViewUtil;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Singleton;

@Module
public class GaudiModule {
    @Provides
    @Singleton
    public MessageBundle provideMessages(){
        return new MessageBundle();
    }

    @Provides
    @Singleton
    @Inject
    public ViewUtil provideViewUtil(MessageBundle msg){
        return new ViewUtil(msg);
    }

    @Inject
    @Singleton
    @Provides
    public IndexController indexController(MessageBundle bundle, ViewUtil viewUtil){
        return new IndexController(bundle, viewUtil);
    }

    @Inject
    @Singleton
    @Provides
    public ChallengeController challengeController(MessageBundle bundle, ViewUtil viewUtil){
        return new ChallengeController(bundle, viewUtil);
    }

    @Inject
    @Singleton
    @Provides
    public LoginController loginController(MessageBundle bundle, ViewUtil viewUtil){
        return new LoginController(bundle, viewUtil);
    }

    @Inject
    @Singleton
    @Provides
    public SettingsController settingsController(MessageBundle bundle, ViewUtil viewUtil){
        return new SettingsController(bundle, viewUtil);
    }
}
