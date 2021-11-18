package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText fname, lname, user, pass, cpass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        cpass = (EditText) findViewById(R.id.conpass);
        btn = (Button) findViewById(R.id.btncreate);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        if (view==btn) {

            if(fname.getText().toString().equals("") || lname.getText().toString().equals("") || user.getText().toString().equals("") || pass.getText().toString().equals("") ||cpass.getText().toString().equals("")){
                displaymessage();
            }
            else if(pass.getText().toString().equals(cpass.getText().toString()) ){
                MyInfo.first = fname.getText().toString();
                MyInfo.last = lname.getText().toString();
                MyInfo.user = user.getText().toString();

                Intent on = new Intent(this, secondAct.class);
                startActivity(on);
            }
            else {
                notmatch();
            }
        }
    }

    private void notmatch() {
        Toast.makeText(this,"Password does not match", Toast.LENGTH_SHORT).show();
    }

    private void displaymessage() {
        Toast.makeText(this,"Fill all the blanks", Toast.LENGTH_SHORT).show();
    }
}