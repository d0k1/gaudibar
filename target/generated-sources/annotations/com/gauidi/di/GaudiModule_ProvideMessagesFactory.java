package com.gauidi.di;

import com.gauidi.util.MessageBundle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GaudiModule_ProvideMessagesFactory implements Factory<MessageBundle> {
  private final GaudiModule module;

  public GaudiModule_ProvideMessagesFactory(GaudiModule module) {
    this.module = module;
  }

  @Override
  public MessageBundle get() {
    return provideMessages(module);
  }

  public static GaudiModule_ProvideMessagesFactory create(GaudiModule module) {
    return new GaudiModule_ProvideMessagesFactory(module);
  }

  public static MessageBundle provideMessages(GaudiModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMessages());
  }
}
