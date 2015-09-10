package com.mateuyabar.android.cleanbase.presentation.view.fragments;

import android.support.v4.app.Fragment;

import com.mateuyabar.android.cleanbase.presentation.presenters.Presenter;

/**
 * Base implementation of an Activity with a presenter.
 */
public abstract class PresenterFragment<P extends Presenter> extends Fragment{
    public abstract P getPresenter();

    @Override
    public void onPause() {
        getPresenter().pause();
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenter().resume();
    }

    @Override
    public void onDestroy() {
        getPresenter().destroy();
        super.onDestroy();
    }
}
