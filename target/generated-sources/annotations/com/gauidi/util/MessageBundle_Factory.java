package com.gauidi.util;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MessageBundle_Factory implements Factory<MessageBundle> {
  @Override
  public MessageBundle get() {
    return newInstance();
  }

  public static MessageBundle_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MessageBundle newInstance() {
    return new MessageBundle();
  }

  private static final class InstanceHolder {
    private static final MessageBundle_Factory INSTANCE = new MessageBundle_Factory();
  }
}
