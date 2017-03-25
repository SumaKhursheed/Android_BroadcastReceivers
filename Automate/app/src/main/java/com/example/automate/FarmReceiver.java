package com.example.automate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class FarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("com.example.tempsender")) {
        FarmmaintenanceActivity.temptext = intent.getExtras().getInt("temp");
        Log.d("message","the temp and humidiy are broadcasted");
    }
    else if(intent.getAction().equals("com.example.tempreceiver")) {
            FarmmaintenanceActivity.message = intent.getExtras().getInt("msg");
            Log.d("message","the msg got broadcasted");
        }
    }
}
