package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondAct extends AppCompatActivity {

    TextView welcome, last, user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcome = (TextView) findViewById(R.id.welcome);
        last = (TextView) findViewById(R.id.last);
        user = (TextView) findViewById(R.id.user);

        welcome.setText("Welcome to Google, " +  MyInfo.first + "!");
        last.setText(MyInfo.last);
        user.setText(MyInfo.user);
    }
}