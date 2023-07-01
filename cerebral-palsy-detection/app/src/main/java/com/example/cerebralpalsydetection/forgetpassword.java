package com.example.cerebralpalsydetection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

public class forgetpassword extends AppCompatActivity {
    private Button forgetbtn;
    private TextInputLayout emailtxt;
    private String email;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpassword);

        auth = FirebaseAuth.getInstance();

        emailtxt = findViewById(R.id.forgetemail);
        forgetbtn = findViewById(R.id.forgetbutton);

        forgetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validatedata();
            }
        });
    }

    private void validatedata() {
        email = emailtxt.getEditText().getText().toString();
        if(email.isEmpty())
        {
            emailtxt.setError("Email Required");
        }
        else
        {
            forgetpass();
        }
    }

    private void forgetpass() {
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(forgetpassword.this, "Reset password link send to your email account",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(forgetpassword.this, login.class));
                    finish();
                }
                else
                {
                    Toast.makeText(forgetpassword.this, "Error : " + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}