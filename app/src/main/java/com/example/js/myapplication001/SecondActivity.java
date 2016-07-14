package com.example.js.myapplication001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/7/4.
 */
public class SecondActivity extends Activity{
    private Button btn_back = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String str = intent.getStringExtra("test");
        btn_back = (Button)findViewById(R.id.activity_back);
        btn_back.setText(str);


    }
}
