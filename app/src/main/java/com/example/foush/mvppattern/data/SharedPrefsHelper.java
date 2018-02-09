package com.example.foush.mvppattern.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by foush on 09/02/18.
 */

public class SharedPrefsHelper {
    public static final String MY_PREFS="MY_PREFS";
    public static final String EMAIL="EMAIL";
    SharedPreferences mSharedPreference;
    public SharedPrefsHelper(Context context){
        mSharedPreference=context.getSharedPreferences(MY_PREFS,Context.MODE_PRIVATE);
    }
    public void clear(){
        mSharedPreference.edit().clear().apply();
    }
    public void putEmail(String email){
        mSharedPreference.edit().putString(EMAIL,email);
    }
    public String getEmail(){
        return mSharedPreference.getString(EMAIL,null);
    }
    public boolean getLoggedInMode(){
        return mSharedPreference.getBoolean("IS_LOGGED_IN",false);
    }
    public void setLoggedInMode(Boolean loggedIn){
        mSharedPreference.edit().putBoolean("IS_LOGGED_IN",loggedIn);
    }
}
