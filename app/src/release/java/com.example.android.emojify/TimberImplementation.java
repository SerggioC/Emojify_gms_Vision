package com.example.android.emojify;

import timber.log.Timber;

/**
 * Created by Sergio on 21/03/2018.
 */

public class TimberImplementation {
    public static void init() {
        Timber.plant(new ReleaseTree());
    }
}