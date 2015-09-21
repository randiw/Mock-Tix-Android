package com.gojek.gotix.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.astuetz.PagerSlidingTabStrip;
import com.gojek.gotix.R;
import com.gojek.gotix.fragments.BaseFragment;
import com.gojek.gotix.fragments.MyTicketsFragment;
import com.gojek.gotix.fragments.OnSaleFragment;
import com.gojek.gotix.presenter.MainPresenter;

import java.util.ArrayList;

import butterknife.Bind;
import nucleus.factory.RequiresPresenter;

@RequiresPresenter(MainPresenter.class)
public class MainActivity extends BaseActivity<MainPresenter> {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.tabs) PagerSlidingTabStrip tabStrip;
    @Bind(R.id.pager) ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager()));
        tabStrip.setViewPager(viewPager);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    private class MainPagerAdapter extends FragmentPagerAdapter {

        private ArrayList<BaseFragment> fragments;

        public MainPagerAdapter(FragmentManager fm) {
            super(fm);
            fragments = new ArrayList<>();
            fragments.add(OnSaleFragment.newInstance());
            fragments.add(MyTicketsFragment.newInstance());
        }

        @Override
        public BaseFragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return getItem(position).getTitle();
        }
    }
}