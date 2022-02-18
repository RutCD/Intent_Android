package com.button.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    Intent intent = getIntent();
    String message1 = intent.getStringExtra("SEND_SOMETHING");

    // Capture the layout's TextView and set the string as its text
    TextView some = (TextView) findViewById(R.id.ediText);
        some.setText(message1);

    }
}