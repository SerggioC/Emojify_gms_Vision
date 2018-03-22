package com.example.android.emojify;

import timber.log.Timber;

import static android.util.Log.ERROR;
import static android.util.Log.WARN;

/**
 * Created by Sergio on 21/03/2018.
 * Sergio>>>
 *  Used only on release Build variant to log problematic
 *  errors to a crash Library like Crashlytics or Firebase
 *  May be used to disable debug altogether, improve performance
 *  and avoid fetching and deleting log statements on release builds.
 */

public class ReleaseTree extends Timber.Tree {
    @Override
    protected void log(int priority, String tag, String message, Throwable t) {

        if (priority == ERROR || priority == WARN) {
            //YourCrashLibrary.log(priority, tag, message);
        }
    }
}