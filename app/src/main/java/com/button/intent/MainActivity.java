package com.button.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String SEND_SOMETHING ="some";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        EditText some = (EditText) findViewById(R.id.ediText);
        String message1 = some.getText().toString();
        intent.putExtra("SEND_SOMETHING", message1);
        startActivity(intent);
    }




}