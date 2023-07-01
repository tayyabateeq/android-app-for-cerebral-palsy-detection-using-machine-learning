package com.example.cerebralpalsydetection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {
    private Button signupbutton, loginbutton, forgetbutton;
    private TextInputLayout email_var, password_var;
    private FirebaseAuth auth;
    private String email_, password_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        auth = FirebaseAuth.getInstance();

        signupbutton = findViewById(R.id.signupbtn);
        loginbutton = findViewById(R.id.loginbtn);
        forgetbutton = findViewById(R.id.forgetpasswordbtn);

        email_var = findViewById(R.id.email_text_field);
        password_var = findViewById(R.id.password_text_field);

       loginbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               validateuser();

           }
       });


        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), signup.class);
                startActivity(intent);
                finish();
            }
        });

        forgetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), forgetpassword.class);
                startActivity(intent);
                finish();

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (auth.getCurrentUser() != null)
        {
            startActivity(new Intent(this, Home.class));
            finish();
        }
    }

    private void validateuser() {
        email_ = email_var.getEditText().getText().toString();
        password_ = password_var.getEditText().getText().toString();
        if (email_.isEmpty() || password_.isEmpty())
        {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
        }
        else
        {
            loginuser();
        }
    }

    private void loginuser() {

        auth.signInWithEmailAndPassword(email_,password_).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    Toast.makeText(login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login.this, Home.class));
                    finish();
                }
                else
                {
                    Toast.makeText(login.this, "Error : " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}