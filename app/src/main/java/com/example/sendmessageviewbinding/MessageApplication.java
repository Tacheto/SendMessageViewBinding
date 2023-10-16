package com.example.sendmessageviewbinding;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.app.Application;
import android.util.Log;

public class MessageApplication extends Application {

    public static final String TAG ="MessageApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "MessageApplication -> onCreate()");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "MessageApplication -> onTerminate()");

    }
}
