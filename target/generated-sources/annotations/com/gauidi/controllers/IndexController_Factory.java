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
public final class IndexController_Factory implements Factory<IndexController> {
  private final Provider<MessageBundle> bundleProvider;

  private final Provider<ViewUtil> viewUtilProvider;

  public IndexController_Factory(Provider<MessageBundle> bundleProvider,
      Provider<ViewUtil> viewUtilProvider) {
    this.bundleProvider = bundleProvider;
    this.viewUtilProvider = viewUtilProvider;
  }

  @Override
  public IndexController get() {
    return newInstance(bundleProvider.get(), viewUtilProvider.get());
  }

  public static IndexController_Factory create(Provider<MessageBundle> bundleProvider,
      Provider<ViewUtil> viewUtilProvider) {
    return new IndexController_Factory(bundleProvider, viewUtilProvider);
  }

  public static IndexController newInstance(MessageBundle bundle, ViewUtil viewUtil) {
    return new IndexController(bundle, viewUtil);
  }
}
