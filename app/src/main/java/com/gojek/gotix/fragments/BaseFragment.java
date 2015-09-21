package com.gojek.gotix.fragments;

import com.gojek.gotix.presenter.BasePresenter;

import lib.gojek.base.AbstractBaseFragment;

/**
 * Created by randi on 9/18/15.
 */
public abstract class BaseFragment<T extends BasePresenter> extends AbstractBaseFragment<T> {

    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}