package com.mbo.rxmarvel.rxmarvel;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import net.danlew.android.joda.JodaTimeAndroid;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JodaTimeAndroid.init(this);
        Fresco.initialize(this);
    }
}
