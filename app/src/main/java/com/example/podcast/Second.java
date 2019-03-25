package com.example.podcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    private EditText eta;
    private EditText etb;
    private TextView txta;
    private TextView txtb;
    private TextView txtc;
    private Button btn;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txta=(TextView)findViewById(R.id.txta);
        txtb=(TextView)findViewById(R.id.txtb);
        txtc=(TextView)findViewById(R.id.txtc);
        eta=(EditText)findViewById(R.id.eta);
        etb=(EditText)findViewById(R.id.etb);
        btn=(Button)findViewById(R.id.btn);
        txtb.setText("number of attempts remaining:5");
        txtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegister();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(eta.getText().toString(),etb.getText().toString());
            }
        });
    }
     public void openRegister()   {
         Intent intent=new Intent(this,Register.class);
         startActivity(intent);
     }
    private void validate(String Username,String Password){
        if(Username.equals("Abhijeet")&& Password.equals("8579")){
            Intent intent= new Intent(Second.this,Third.class);
            startActivity(intent);

        }else{
            counter--;
             txtb.setText("number of attempts remaining:"+String.valueOf(counter));
              if(counter==0){
                  btn.setEnabled(false);
              }
        }
    }
}
