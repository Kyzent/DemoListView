package com.myapplicationdev.android.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvInfo = findViewById(R.id.textView);

        Intent i = getIntent();
        String info = i.getStringExtra("info");

        tvInfo.setText(info);

    }
}
