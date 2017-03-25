package com.example.tempreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("com.example.tempsender")) {

            FarmmanagerActivity.temp_text = intent.getExtras().getInt("temp");
            FarmmanagerActivity.humidity_text = intent.getExtras().getInt("humid");
            Log.d("message","the temp and humidiy are broadcasted");
        }
    }
}

