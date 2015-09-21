package lib.gojek.base;

import android.os.Bundle;

import butterknife.ButterKnife;
import nucleus.view.NucleusAppCompatActivity;

/**
 * Created by randi on 9/21/15.
 */
public abstract class AbstractBaseActivity<T extends AbstractBasePresenter> extends NucleusAppCompatActivity<T> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
    }

    protected abstract int getLayout();
}