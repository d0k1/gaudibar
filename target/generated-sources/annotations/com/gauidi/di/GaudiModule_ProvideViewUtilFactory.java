package com.gauidi.di;

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
public final class GaudiModule_ProvideViewUtilFactory implements Factory<ViewUtil> {
  private final GaudiModule module;

  private final Provider<MessageBundle> msgProvider;

  public GaudiModule_ProvideViewUtilFactory(GaudiModule module,
      Provider<MessageBundle> msgProvider) {
    this.module = module;
    this.msgProvider = msgProvider;
  }

  @Override
  public ViewUtil get() {
    return provideViewUtil(module, msgProvider.get());
  }

  public static GaudiModule_ProvideViewUtilFactory create(GaudiModule module,
      Provider<MessageBundle> msgProvider) {
    return new GaudiModule_ProvideViewUtilFactory(module, msgProvider);
  }

  public static ViewUtil provideViewUtil(GaudiModule instance, MessageBundle msg) {
    return Preconditions.checkNotNullFromProvides(instance.provideViewUtil(msg));
  }
}
