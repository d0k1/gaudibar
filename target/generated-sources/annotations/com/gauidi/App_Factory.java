package com.gauidi;

import com.gauidi.controllers.ChallengeController;
import com.gauidi.controllers.IndexController;
import com.gauidi.controllers.LoginController;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class App_Factory implements Factory<App> {
  private final Provider<IndexController> indexControllerProvider;

  private final Provider<ChallengeController> challengeControllerProvider;

  private final Provider<LoginController> loginControllerProvider;

  public App_Factory(Provider<IndexController> indexControllerProvider,
      Provider<ChallengeController> challengeControllerProvider,
      Provider<LoginController> loginControllerProvider) {
    this.indexControllerProvider = indexControllerProvider;
    this.challengeControllerProvider = challengeControllerProvider;
    this.loginControllerProvider = loginControllerProvider;
  }

  @Override
  public App get() {
    return newInstance(indexControllerProvider.get(), challengeControllerProvider.get(), loginControllerProvider.get());
  }

  public static App_Factory create(Provider<IndexController> indexControllerProvider,
      Provider<ChallengeController> challengeControllerProvider,
      Provider<LoginController> loginControllerProvider) {
    return new App_Factory(indexControllerProvider, challengeControllerProvider, loginControllerProvider);
  }

  public static App newInstance(IndexController indexController,
      ChallengeController challengeController, LoginController loginController) {
    return new App(indexController, challengeController, loginController);
  }
}
