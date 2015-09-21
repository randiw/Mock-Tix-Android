package com.gojek.gotix.presenter;

import android.content.Context;
import android.os.Bundle;

import com.gojek.gotix.AppController;

import lib.gojek.base.AbstractBasePresenter;
import nucleus.view.ViewWithPresenter;

/**
 * Created by randi on 9/17/15.
 */
public abstract class BasePresenter<T extends ViewWithPresenter> extends AbstractBasePresenter<T> {

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