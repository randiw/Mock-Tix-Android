package com.gojek.gotix.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.github.johnkil.print.PrintDrawable;
import com.gojek.gotix.R;
import com.gojek.gotix.presenter.BasePresenter;

import butterknife.Bind;
import lib.gojek.base.AbstractBaseActivity;

/**
 * Created by randi on 9/17/15.
 */
public abstract class BaseActivity<T extends BasePresenter> extends AbstractBaseActivity<T> {

    private static final String TAG = BaseActivity.class.getSimpleName();

    @Nullable @Bind(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (toolbar != null) {
            toolbar.setTitle(R.string.app_name);
            toolbar.setLogo(R.drawable.ic_actionbar);
            toolbar.setNavigationIcon(R.drawable.back_button_new);

            setSupportActionBar(toolbar);
        }
    }

    public void setTitle(String title) {
        if (toolbar != null) {
            toolbar.setTitle(title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        menu.findItem(R.id.action_call).setIcon(
                new PrintDrawable.Builder(getApplicationContext())
                        .iconTextRes(R.string.ic_material_call)
                        .iconColorRes(android.R.color.white)
                        .iconSizeRes(R.dimen.toolbar_icon_size)
                        .build());

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;

            case R.id.action_call:
                startActivity(new Intent(this, CallCenterActivity.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}