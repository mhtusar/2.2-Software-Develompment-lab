package com.example.orderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class signup_Activity extends AppCompatActivity {
    Button b1;
    EditText etName,etMobile,etPassword,etEmail;
    Button registration;
    AwesomeValidation validation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_);
        //variable
        etName = findViewById(R.id.editTextTextPersonName);
        etMobile = findViewById(R.id.editTextPhone);
        etEmail = findViewById(R.id.editTextTextEmailAddress);
        etPassword = findViewById(R.id.editTextTextPassword);
        registration=findViewById(R.id.registration);
        validation = new AwesomeValidation(ValidationStyle.BASIC);


        //Name
        validation.addValidation(this,R.id.editTextTextPersonName, RegexTemplate.NOT_EMPTY,R.string.invalid_name);
        validation.addValidation(this,R.id.editTextPhone, "[0]{1}[1]{1}[3-4,6-9]{1}[0-9]{8}$",R.string.invalid_mobile);
        validation.addValidation(this,R.id.editTextTextEmailAddress, Patterns.EMAIL_ADDRESS,R.string.invalid_email);
        validation.addValidation(this,R.id.editTextTextPassword,".{6}",R.string.invalid_pass);

        getSupportActionBar().setTitle("NST Expresso Bar");
         b1=findViewById(R.id.registration);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {



                if(validation.validate())
                {
                    //on success
                    Toast.makeText(getApplicationContext(),"Form validate successfully",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(signup_Activity.this,signin_Activity.class);
                    startActivity(intent);

                }
                else { Toast.makeText(getApplicationContext(),"Validation Failed",Toast.LENGTH_SHORT).show();
                }
                }



            }

        );
    }
}