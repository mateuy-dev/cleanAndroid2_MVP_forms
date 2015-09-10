package com.mateuyabar.android.cleanapp.presentation.view.fragments;

import com.mateuyabar.android.cleanapp.presentation.navigation.Navigator;
import com.mateuyabar.android.cleanbase.presentation.presenters.Presenter;
import com.mateuyabar.android.cleanbase.presentation.view.fragments.PresenterFragment;


public abstract class BaseFragment<P extends Presenter> extends PresenterFragment<P> {
    Navigator navigator = new Navigator();

    public Navigator getNavigator() {
        return navigator;
    }
}
