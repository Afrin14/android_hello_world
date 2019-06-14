package com.github.afrin14.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ClickedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicked_activity);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA);

        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setText("Hello" + message);

    }



}
