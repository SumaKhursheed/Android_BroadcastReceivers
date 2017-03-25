package com.example.automate;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class FarmmaintenanceActivity extends Activity {

    public static int temptext;
    public static int message;
    private TextView fanId;
    private TextView sprId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmmaintenance);
        fanId = (TextView) findViewById(R.id.fanON);
        sprId = (TextView) findViewById(R.id.fansprON);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if ((temptext > 70 & temptext < 90) || (message == 1)){
            fanId.setText("Fan On");
            sprId.setText("Sprinkler Off");
            Log.d("Apply", "applied in ui");

        }
        else if ((temptext > 90 & temptext < 125) || (message == 2)){
            fanId.setText("Fan On");
            sprId.setText("Sprinkler On");
            Log.d("Apply", "applied in uii");

        }
        temptext = 0;
        message = 0;




    }

}
