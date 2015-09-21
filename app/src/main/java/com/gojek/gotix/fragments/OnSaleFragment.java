package com.gojek.gotix.fragments;

import com.gojek.gotix.AppController;
import com.gojek.gotix.R;

/**
 * Created by randi on 9/18/15.
 */
public class OnSaleFragment extends BaseFragment {

    public static OnSaleFragment newInstance() {
        OnSaleFragment onSaleFragment = new OnSaleFragment();
        onSaleFragment.setTitle(AppController.getInstance().getString(R.string.on_sale));
        return onSaleFragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_onsale;
    }
}