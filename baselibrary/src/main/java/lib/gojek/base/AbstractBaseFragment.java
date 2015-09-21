package lib.gojek.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import nucleus.view.NucleusSupportFragment;

/**
 * Created by randi on 9/21/15.
 */
public abstract class AbstractBaseFragment<T extends AbstractBasePresenter> extends NucleusSupportFragment<T> {

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
}