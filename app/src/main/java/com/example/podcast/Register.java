package com.example.podcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText et1,et2,et3;
    private TextView txt1,txt2;
    private Button btnr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setupUIViews();
        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate()){
                    //upload data to database
                }

            }
        });


        }
    }
    private void setupUIViews(){
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        btnr=(Button)findViewById(R.id.btnr);
    }
     private Boolean validate(){
        Boolean result=false;

        String name=et1.getText().toString();
        String password=et3.getText().toString();
        String email=et2.getText().toString();

        if(name.isEmpty())&& password.isEmpty() && email.isEmpty()){
             Toast.makeText(this,"please enter details", Toast.LENGTH_SHORT).show();
         }
     }

}
