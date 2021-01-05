package com.gauidi.util;

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
public final class ViewUtil_Factory implements Factory<ViewUtil> {
  private final Provider<MessageBundle> msgProvider;

  public ViewUtil_Factory(Provider<MessageBundle> msgProvider) {
    this.msgProvider = msgProvider;
  }

  @Override
  public ViewUtil get() {
    return newInstance(msgProvider.get());
  }

  public static ViewUtil_Factory create(Provider<MessageBundle> msgProvider) {
    return new ViewUtil_Factory(msgProvider);
  }

  public static ViewUtil newInstance(MessageBundle msg) {
    return new ViewUtil(msg);
  }
}
