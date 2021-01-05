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
public final class ChallengeController_Factory implements Factory<ChallengeController> {
  private final Provider<MessageBundle> bundleProvider;

  private final Provider<ViewUtil> viewUtilProvider;

  public ChallengeController_Factory(Provider<MessageBundle> bundleProvider,
      Provider<ViewUtil> viewUtilProvider) {
    this.bundleProvider = bundleProvider;
    this.viewUtilProvider = viewUtilProvider;
  }

  @Override
  public ChallengeController get() {
    return newInstance(bundleProvider.get(), viewUtilProvider.get());
  }

  public static ChallengeController_Factory create(Provider<MessageBundle> bundleProvider,
      Provider<ViewUtil> viewUtilProvider) {
    return new ChallengeController_Factory(bundleProvider, viewUtilProvider);
  }

  public static ChallengeController newInstance(MessageBundle bundle, ViewUtil viewUtil) {
    return new ChallengeController(bundle, viewUtil);
  }
}
