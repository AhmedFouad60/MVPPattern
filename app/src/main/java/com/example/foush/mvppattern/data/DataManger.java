package com.example.foush.mvppattern.data;

/**
 * Created by foush on 09/02/18.
 */

public class DataManger {
    SharedPrefsHelper mSharedprefsHelper;
    public DataManger(SharedPrefsHelper sharedPrefsHelper){
        mSharedprefsHelper=sharedPrefsHelper;
    }

    public void clear(){
        mSharedprefsHelper.clear();
    }
    public void saveEmailId(String email){
        mSharedprefsHelper.putEmail(email);

    }
    public String getEmailId(){
        return mSharedprefsHelper.getEmail();
    }
    public void setLoggedInMode(){
        mSharedprefsHelper.setLoggedInMode(true);
    }
    public Boolean getLoggedInMode(){
        return mSharedprefsHelper.getLoggedInMode();
    }





}
