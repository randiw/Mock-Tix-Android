package com.gojek.gotix.presenter;

import android.content.Context;
import android.os.Bundle;

import com.gojek.gotix.AppController;

import nucleus.presenter.RxPresenter;
import nucleus.view.ViewWithPresenter;

/**
 * Created by randi on 9/17/15.
 */
public abstract class BasePresenter<T extends ViewWithPresenter> extends RxPresenter<T> {

    private Context context;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        context = AppController.getInstance().getApplicationContext();
    }

    protected Context getContext() {
        return context;
    }
}