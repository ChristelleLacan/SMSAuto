package com.example.smsauto;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SMSTime extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smstime);
        Button btnEnvoie = (Button)findViewById(R.id.send);
        final EditText numero =(EditText)findViewById(R.id.numero);
        final EditText message = (EditText)findViewById(R.id.message);

        btnEnvoie.setOnClickListener(new OnClickListener() {
 
			public void onClick(View v) {
				String num = numero.getText().toString();
				String msg = message.getText().toString();
				if(num.length()>= 10 && msg.length() > 0){
					SmsManager.getDefault().sendTextMessage(num, null, msg, null, null);

					numero.setText("");
					message.setText("");
				}else{
					Toast.makeText(SMSTime.this, "Enter le numero et/ou le message", Toast.LENGTH_SHORT).show();
				}
 
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_smstime, menu);
        return true;
    }
}
