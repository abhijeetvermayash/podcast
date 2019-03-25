package com.example.podcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText et1, et2, et3;
    private TextView txt1, txt2;
    private Button btnr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setupUIViews();
        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){

                };
            }
        });
           txt2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   startActivity(new Intent(Register.this,Second.class));
               }
           });

    }
    private void setupUIViews() {
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        btnr = (Button) findViewById(R.id.btnr);
    }
    private Boolean validate() {
        Boolean result = false;
        String name = et1.getText().toString();
        String email = et2.getText().toString();
        String password = et3.getText().toString();

        if (name.isEmpty() && email.isEmpty() && password.isEmpty()) {
            Toast.makeText(this, "please enter details", Toast.LENGTH_SHORT).show();
        } else {
            result = true;
        }
        return result;
    }
}