package com.mateuyabar.android.cleanbase.presentation.view.activities;

import android.support.v7.app.AppCompatActivity;

import com.mateuyabar.android.cleanbase.presentation.presenters.Presenter;

/**
 * Base implementation of an Activity with a presenter.
 */
public abstract class PresenterActivity extends AppCompatActivity{
    public abstract Presenter getPresenter();

    @Override
    protected void onPause() {
        getPresenter().pause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getPresenter().resume();
    }

    @Override
    protected void onDestroy() {
        getPresenter().destroy();
        super.onDestroy();
    }
}
