package com.example.orderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  splash_Activity extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_);
        getSupportActionBar().hide();
        b1=findViewById(R.id.button_login);
        b2=findViewById(R.id.button_signup);
        b3=findViewById(R.id.Skip_button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(splash_Activity.this,signin_Activity.class);
                startActivity(intent);


            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(splash_Activity.this,signup_Activity.class);
                startActivity(intent);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(splash_Activity.this,MainActivity.class);
                startActivity(intent);


            }
        });
    }
}