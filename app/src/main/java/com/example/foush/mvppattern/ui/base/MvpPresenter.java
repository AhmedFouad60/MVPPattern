package com.example.foush.mvppattern.ui.base;

/**
 * Created by foush on 09/02/18.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V MvpView);
}
