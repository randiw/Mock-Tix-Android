package com.gojek.gotix;

import android.app.Application;

import com.github.johnkil.print.PrintConfig;

/**
 * Created by randi on 9/17/15.
 */
public class AppController extends Application {

    private static AppController instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        PrintConfig.initDefault(getAssets(), getString(R.string.MaterialIconFont));
    }

    public static synchronized AppController getInstance() {
        return instance;
    }
}