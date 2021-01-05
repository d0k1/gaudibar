package com.gauidi.di;

import com.gauidi.controllers.ChallengeController;
import com.gauidi.controllers.IndexController;
import com.gauidi.controllers.LoginController;
import com.gauidi.util.MessageBundle;
import com.gauidi.util.ViewUtil;
import dagger.MembersInjector;
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
public final class GaudiModule_MembersInjector implements MembersInjector<GaudiModule> {
  private final Provider<MessageBundle> msgProvider;

  private final Provider<MessageBundle> bundleProvider;

  private final Provider<ViewUtil> viewUtilProvider;

  private final Provider<MessageBundle> bundleProvider2;

  private final Provider<ViewUtil> viewUtilProvider2;

  private final Provider<MessageBundle> bundleProvider3;

  private final Provider<ViewUtil> viewUtilProvider3;

  public GaudiModule_MembersInjector(Provider<MessageBundle> msgProvider,
      Provider<MessageBundle> bundleProvider, Provider<ViewUtil> viewUtilProvider,
      Provider<MessageBundle> bundleProvider2, Provider<ViewUtil> viewUtilProvider2,
      Provider<MessageBundle> bundleProvider3, Provider<ViewUtil> viewUtilProvider3) {
    this.msgProvider = msgProvider;
    this.bundleProvider = bundleProvider;
    this.viewUtilProvider = viewUtilProvider;
    this.bundleProvider2 = bundleProvider2;
    this.viewUtilProvider2 = viewUtilProvider2;
    this.bundleProvider3 = bundleProvider3;
    this.viewUtilProvider3 = viewUtilProvider3;
  }

  public static MembersInjector<GaudiModule> create(Provider<MessageBundle> msgProvider,
      Provider<MessageBundle> bundleProvider, Provider<ViewUtil> viewUtilProvider,
      Provider<MessageBundle> bundleProvider2, Provider<ViewUtil> viewUtilProvider2,
      Provider<MessageBundle> bundleProvider3, Provider<ViewUtil> viewUtilProvider3) {
    return new GaudiModule_MembersInjector(msgProvider, bundleProvider, viewUtilProvider, bundleProvider2, viewUtilProvider2, bundleProvider3, viewUtilProvider3);
  }

  @Override
  public void injectMembers(GaudiModule instance) {
    injectProvideViewUtil(instance, msgProvider.get());
    injectIndexController(instance, bundleProvider.get(), viewUtilProvider.get());
    injectChallengeController(instance, bundleProvider2.get(), viewUtilProvider2.get());
    injectLoginController(instance, bundleProvider3.get(), viewUtilProvider3.get());
  }

  public static ViewUtil injectProvideViewUtil(GaudiModule instance, MessageBundle msg) {
    return instance.provideViewUtil(msg);
  }

  public static IndexController injectIndexController(GaudiModule instance, MessageBundle bundle,
      ViewUtil viewUtil) {
    return instance.indexController(bundle, viewUtil);
  }

  public static ChallengeController injectChallengeController(GaudiModule instance,
      MessageBundle bundle, ViewUtil viewUtil) {
    return instance.challengeController(bundle, viewUtil);
  }

  public static LoginController injectLoginController(GaudiModule instance, MessageBundle bundle,
      ViewUtil viewUtil) {
    return instance.loginController(bundle, viewUtil);
  }
}
