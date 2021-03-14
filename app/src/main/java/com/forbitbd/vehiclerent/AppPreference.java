package com.forbitbd.vehiclerent;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreference {

    private static final String SharedPreferenceName="SP";
    private static final String PHONENUMBER="PHONENUMBER";
    private static final String EMAIL="EMAIL";
    private static final String LOGIN="LOGIN";

    private static AppPreference appPreference = null;
    SharedPreferences Sp;

    private AppPreference(Context context) {
        Sp = context.getSharedPreferences(SharedPreferenceName,context.MODE_PRIVATE);
    }

    public static AppPreference getInstance(Context context){
        if(appPreference==null){
            appPreference = new AppPreference(context);
        }
        return appPreference;
    }
}
