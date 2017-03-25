package com.example.tempsender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class TemphumidActivity extends Activity {

    int temperature;
    int humidity;
    EditText temp_id;
    EditText humid_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temphumid);
    }

    public void onBtnClicked(View view) {
        temp_id = (EditText)findViewById(R.id.temp);
        temperature = Integer.valueOf(temp_id.getText().toString());
        humid_id = (EditText)findViewById(R.id.humid);
        humidity = Integer.valueOf(humid_id.getText().toString());

        Intent intent = new Intent ();
        intent.setAction("com.example.tempsender");

        intent.putExtra("temp", temperature);
        intent.putExtra("humid", humidity);
        Log.d("Apply", "applied in ui");

        sendBroadcast(intent);


    }

    public void onClickButtonCloseApp(View v) {
        this.finish();
    }
}

