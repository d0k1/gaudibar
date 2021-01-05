package com.gauidi.di;

import com.gauidi.controllers.ChallengeController;
import com.gauidi.controllers.IndexController;
import com.gauidi.controllers.LoginController;
import com.gauidi.util.MessageBundle;
import com.gauidi.util.ViewUtil;
import dagger.internal.DoubleCheck;
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
public final class DaggerGaudiComponent implements GaudiComponent {
  private Provider<MessageBundle> provideMessagesProvider;

  private Provider<ViewUtil> provideViewUtilProvider;

  private Provider<IndexController> indexControllerProvider;

  private Provider<ChallengeController> challengeControllerProvider;

  private Provider<LoginController> loginControllerProvider;

  private DaggerGaudiComponent(GaudiModule gaudiModuleParam) {

    initialize(gaudiModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static GaudiComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final GaudiModule gaudiModuleParam) {
    this.provideMessagesProvider = DoubleCheck.provider(GaudiModule_ProvideMessagesFactory.create(gaudiModuleParam));
    this.provideViewUtilProvider = DoubleCheck.provider(GaudiModule_ProvideViewUtilFactory.create(gaudiModuleParam, provideMessagesProvider));
    this.indexControllerProvider = DoubleCheck.provider(GaudiModule_IndexControllerFactory.create(gaudiModuleParam, provideMessagesProvider, provideViewUtilProvider));
    this.challengeControllerProvider = DoubleCheck.provider(GaudiModule_ChallengeControllerFactory.create(gaudiModuleParam, provideMessagesProvider, provideViewUtilProvider));
    this.loginControllerProvider = DoubleCheck.provider(GaudiModule_LoginControllerFactory.create(gaudiModuleParam, provideMessagesProvider, provideViewUtilProvider));
  }

  @Override
  public MessageBundle messages() {
    return provideMessagesProvider.get();
  }

  @Override
  public ViewUtil viewUtils() {
    return provideViewUtilProvider.get();
  }

  @Override
  public IndexController indexController() {
    return indexControllerProvider.get();
  }

  @Override
  public ChallengeController challengeController() {
    return challengeControllerProvider.get();
  }

  @Override
  public LoginController loginController() {
    return loginControllerProvider.get();
  }

  public static final class Builder {
    private GaudiModule gaudiModule;

    private Builder() {
    }

    public Builder gaudiModule(GaudiModule gaudiModule) {
      this.gaudiModule = Preconditions.checkNotNull(gaudiModule);
      return this;
    }

    public GaudiComponent build() {
      if (gaudiModule == null) {
        this.gaudiModule = new GaudiModule();
      }
      return new DaggerGaudiComponent(gaudiModule);
    }
  }
}
