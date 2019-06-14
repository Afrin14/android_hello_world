package com.github.afrin14.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        EditText et = (EditText)findViewById(R.id.editText);
        Button bt = (Button)findViewById(R.id.button);
        String message = et.getText().toString();
        Intent intent = new Intent(this, ClickedActivity.class);
        intent.putExtra(EXTRA, message);
        startActivity(intent);

    }
}
