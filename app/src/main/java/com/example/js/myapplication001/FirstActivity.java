package com.example.js.myapplication001;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    private Button btnSwitch = null;
    private Button btnSearch = null;
    private Button btnFindMe = null;
    private Button btnScan   = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btnSwitch = (Button)findViewById(R.id.activity_switch);
        btnScan = (Button)findViewById(R.id.activity_scan);

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto://0800000123");
                Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra("sms_body","The SMS text");
                startActivity(intent);
            }
        });

    }

    public void BtnSwitchOnClick(View v){
 //       btnSwitch.setText("hello");
        Intent intent = new Intent();
        intent.putExtra("test","123");
        intent.setClass(FirstActivity.this,SecondActivity.class);
        FirstActivity.this.startActivity(intent);
    }
}
