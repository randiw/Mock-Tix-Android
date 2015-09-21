package com.gojek.gotix.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gojek.gotix.presenter.BasePresenter;

import butterknife.ButterKnife;
import nucleus.view.NucleusSupportFragment;

/**
 * Created by randi on 9/18/15.
 */
public abstract class BaseFragment<T extends BasePresenter> extends NucleusSupportFragment<T> {

    private String title;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayout(), container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    protected abstract int getLayout();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}