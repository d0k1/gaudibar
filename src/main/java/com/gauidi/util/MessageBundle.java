package com.gauidi.util;

import javax.inject.Inject;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageBundle {
    private ResourceBundle messagesEn;
    private ResourceBundle messagesRu;

    @Inject
    public MessageBundle() {
        Locale localeEn = Locale.ENGLISH;
        Locale localeRu = Locale.forLanguageTag("ru");
        this.messagesEn = ResourceBundle.getBundle("localization/messages", localeEn);
        this.messagesRu = ResourceBundle.getBundle("localization/messages", localeRu);
    }

    public String get(String message) {
        return messagesEn.getString(message);
    }

    public final String get(final String key, final Object... args) {
        return MessageFormat.format(get(key), args);
    }
}
