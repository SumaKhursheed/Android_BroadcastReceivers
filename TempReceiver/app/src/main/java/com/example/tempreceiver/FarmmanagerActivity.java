package com.example.tempreceiver;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class FarmmanagerActivity extends Activity {

    public static int temp_text;
    public static int humidity_text ;
    private TextView tempId;
    private TextView humidityId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmmanager);
        tempId = (TextView) findViewById(R.id.temp);
        humidityId = (TextView) findViewById(R.id.humid);
    }

    @Override
    protected void onResume() {
        super.onResume();

        tempId.setEnabled(false);
        humidityId.setEnabled(false);
        tempId.setText("" + temp_text);
        humidityId.setText("" + humidity_text);

        Log.d("Apply", "applied in ui");


    }

    public void onFanClicked(View view) {
        Intent intent = new Intent ();
        intent.setAction("com.example.tempreceiver");


        intent.putExtra("msg", 1 );
        Log.d("Apply", "request sent");

        sendBroadcast(intent);
    }

    public void onSprClicked(View view) {
        Intent intent = new Intent ();
        intent.setAction("com.example.tempreceiver");


        intent.putExtra("msg", 2 );
        Log.d("Apply", "request sentt");

        sendBroadcast(intent);
    }
}
