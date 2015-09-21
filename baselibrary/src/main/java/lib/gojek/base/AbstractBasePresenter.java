package lib.gojek.base;

import nucleus.presenter.RxPresenter;
import nucleus.view.ViewWithPresenter;

/**
 * Created by randi on 9/21/15.
 */
public abstract class AbstractBasePresenter<T extends ViewWithPresenter> extends RxPresenter<T> {
}