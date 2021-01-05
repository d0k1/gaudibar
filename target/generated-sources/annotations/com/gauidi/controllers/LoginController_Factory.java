package com.gauidi.controllers;

import com.gauidi.util.MessageBundle;
import com.gauidi.util.ViewUtil;
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
public final class LoginController_Factory implements Factory<LoginController> {
  private final Provider<MessageBundle> bundleProvider;

  private final Provider<ViewUtil> viewUtilProvider;

  public LoginController_Factory(Provider<MessageBundle> bundleProvider,
      Provider<ViewUtil> viewUtilProvider) {
    this.bundleProvider = bundleProvider;
    this.viewUtilProvider = viewUtilProvider;
  }

  @Override
  public LoginController get() {
    return newInstance(bundleProvider.get(), viewUtilProvider.get());
  }

  public static LoginController_Factory create(Provider<MessageBundle> bundleProvider,
      Provider<ViewUtil> viewUtilProvider) {
    return new LoginController_Factory(bundleProvider, viewUtilProvider);
  }

  public static LoginController newInstance(MessageBundle bundle, ViewUtil viewUtil) {
    return new LoginController(bundle, viewUtil);
  }
}
