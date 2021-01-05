package com.gauidi.di;

import com.gauidi.controllers.ChallengeController;
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
public final class GaudiModule_ChallengeControllerFactory implements Factory<ChallengeController> {
  private final GaudiModule module;

  private final Provider<MessageBundle> bundleProvider;

  private final Provider<ViewUtil> viewUtilProvider;

  public GaudiModule_ChallengeControllerFactory(GaudiModule module,
      Provider<MessageBundle> bundleProvider, Provider<ViewUtil> viewUtilProvider) {
    this.module = module;
    this.bundleProvider = bundleProvider;
    this.viewUtilProvider = viewUtilProvider;
  }

  @Override
  public ChallengeController get() {
    return challengeController(module, bundleProvider.get(), viewUtilProvider.get());
  }

  public static GaudiModule_ChallengeControllerFactory create(GaudiModule module,
      Provider<MessageBundle> bundleProvider, Provider<ViewUtil> viewUtilProvider) {
    return new GaudiModule_ChallengeControllerFactory(module, bundleProvider, viewUtilProvider);
  }

  public static ChallengeController challengeController(GaudiModule instance, MessageBundle bundle,
      ViewUtil viewUtil) {
    return Preconditions.checkNotNullFromProvides(instance.challengeController(bundle, viewUtil));
  }
}
