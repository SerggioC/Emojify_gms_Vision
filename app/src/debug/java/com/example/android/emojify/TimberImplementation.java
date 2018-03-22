package com.example.android.emojify;

import timber.log.Timber;

/**
 * Created by Sergio on 21/03/2018.
 */

public class TimberImplementation {
    public static void init() {
        Timber.plant(new Timber.DebugTree() {
            @Override
            protected String createStackElementTag(StackTraceElement element) {
                return String.format("Sergio>:%s:%s",
                        super.createStackElementTag(element),
                        element.getLineNumber());
            }
        });
    }


}