package com.gojek.gotix.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;

import com.gojek.gotix.R;

import butterknife.OnClick;

/**
 * Created by randi on 9/17/15.
 */
public class CallCenterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String title = getString(R.string.action_call);
        setTitle(title.toUpperCase());
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_callcenter;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.action_call).setVisible(false);
        return true;
    }

    @OnClick(R.id.call_now)
    public void callNow() {
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + getString(R.string.call_center_action))));
    }
}