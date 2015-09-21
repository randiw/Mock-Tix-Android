package com.gojek.gotix.fragments;

import com.gojek.gotix.AppController;
import com.gojek.gotix.R;

/**
 * Created by randi on 9/18/15.
 */
public class MyTicketsFragment extends BaseFragment {

    public static MyTicketsFragment newInstance() {
        MyTicketsFragment myTicketsFragment = new MyTicketsFragment();
        myTicketsFragment.setTitle(AppController.getInstance().getString(R.string.my_tickets));
        return myTicketsFragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_mytickets;
    }
}