package com.example.smsauto;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SMSTime extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smstime);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_smstime, menu);
        return true;
    }
}
