package com.gauidi.di;

import com.gauidi.controllers.LoginController;
import com.gauidi.util.MessageBundle;
import com.gauidi.util.ViewUtil;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class GaudiModule_LoginControllerFactory implements Factory<LoginController> {
  private final GaudiModule module;

  private final Provider<MessageBundle> bundleProvider;

  private final Provider<ViewUtil> viewUtilProvider;

  public GaudiModule_LoginControllerFactory(GaudiModule module,
      Provider<MessageBundle> bundleProvider, Provider<ViewUtil> viewUtilProvider) {
    this.module = module;
    this.bundleProvider = bundleProvider;
    this.viewUtilProvider = viewUtilProvider;
  }

  @Override
  public LoginController get() {
    return loginController(module, bundleProvider.get(), viewUtilProvider.get());
  }

  public static GaudiModule_LoginControllerFactory create(GaudiModule module,
      Provider<MessageBundle> bundleProvider, Provider<ViewUtil> viewUtilProvider) {
    return new GaudiModule_LoginControllerFactory(module, bundleProvider, viewUtilProvider);
  }

  public static LoginController loginController(GaudiModule instance, MessageBundle bundle,
      ViewUtil viewUtil) {
    return Preconditions.checkNotNullFromProvides(instance.loginController(bundle, viewUtil));
  }
}
