package com.example.foush.mvppattern.ui.base;

import com.example.foush.mvppattern.data.DataManger;

/**
 * Created by foush on 09/02/18.
 */

public class BasePresenter<V extends MvpView>implements MvpPresenter<V> {
    private V mMvpView;
    DataManger mDataManger;
    //attach the presenter to the DataManger{model}

    public BasePresenter(DataManger dataManger){
        mDataManger=dataManger;
        }
    @Override
    public void onAttach(MvpView MvpView) {
         mMvpView=mMvpView; //attach the presenter to the view
    }


    /**
     * Get the attached view and DataManger to the Presenter
     * */

    public DataManger getmDataManger(){
        return mDataManger;
    }
    public V getMvpView(){
        return mMvpView;
    }



}
