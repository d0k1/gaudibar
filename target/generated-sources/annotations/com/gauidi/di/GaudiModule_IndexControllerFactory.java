package com.gauidi.di;

import com.gauidi.controllers.IndexController;
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
public final class GaudiModule_IndexControllerFactory implements Factory<IndexController> {
  private final GaudiModule module;

  private final Provider<MessageBundle> bundleProvider;

  private final Provider<ViewUtil> viewUtilProvider;

  public GaudiModule_IndexControllerFactory(GaudiModule module,
      Provider<MessageBundle> bundleProvider, Provider<ViewUtil> viewUtilProvider) {
    this.module = module;
    this.bundleProvider = bundleProvider;
    this.viewUtilProvider = viewUtilProvider;
  }

  @Override
  public IndexController get() {
    return indexController(module, bundleProvider.get(), viewUtilProvider.get());
  }

  public static GaudiModule_IndexControllerFactory create(GaudiModule module,
      Provider<MessageBundle> bundleProvider, Provider<ViewUtil> viewUtilProvider) {
    return new GaudiModule_IndexControllerFactory(module, bundleProvider, viewUtilProvider);
  }

  public static IndexController indexController(GaudiModule instance, MessageBundle bundle,
      ViewUtil viewUtil) {
    return Preconditions.checkNotNullFromProvides(instance.indexController(bundle, viewUtil));
  }
}
