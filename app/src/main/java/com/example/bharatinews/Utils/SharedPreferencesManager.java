package com.example.bharatinews.Utils;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {
    SharedPreferences sharedPreferences;
    Context context;
    final String USER_SHARED_PREF = "MySharedPref";
    final String NIGHT_MODE = "NIGHTMODE";

    public SharedPreferencesManager(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(USER_SHARED_PREF,MODE_PRIVATE);
    }

    public boolean getNightMode(){
        return sharedPreferences.getBoolean(NIGHT_MODE, false);

    }
    public void setNightMode(boolean mode){
//        sharedPreferences.setBoolean(NIGHT_MODE, false);
        sharedPreferences.edit().putBoolean(NIGHT_MODE, mode).apply();
    }
}
