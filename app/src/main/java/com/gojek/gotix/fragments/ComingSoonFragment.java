package com.gojek.gotix.fragments;

import com.gojek.gotix.R;

/**
 * Created by randi on 9/18/15.
 */
public class ComingSoonFragment extends BaseFragment {

    public static ComingSoonFragment newInstance(){
        ComingSoonFragment comingSoonFragment = new ComingSoonFragment();
        return comingSoonFragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_comingsoon;
    }
}