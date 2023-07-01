package com.example.cerebralpalsydetection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    private TextInputLayout fullname_var, username_var, email_var, mobile_var, password_var;

    private String fullname_, username_, email_, mobile_, password_;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        auth = FirebaseAuth.getInstance();

        fullname_var = findViewById(R.id.fullname_field);
        username_var = findViewById(R.id.username_field);
        email_var = findViewById(R.id.email_field);
        mobile_var = findViewById(R.id.mobile_field);
        password_var = findViewById(R.id.password_field);


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

    public void loginbutttonclick(View view) {
        Intent intent = new Intent(getApplicationContext(), login.class);
        startActivity(intent);
        finish();
    }

    public void registerbuttonclick(View view) {

        validateuser();
    }

    private void validateuser() {

        fullname_ = fullname_var.getEditText().getText().toString();
        username_ = username_var.getEditText().getText().toString();
        email_ = email_var.getEditText().getText().toString();
        mobile_ = mobile_var.getEditText().getText().toString();
        password_ = password_var.getEditText().getText().toString();

        if (fullname_.isEmpty() || username_.isEmpty() || email_.isEmpty() || mobile_.isEmpty() || password_.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
        } else {
            registeruser();
        }
    }

    private void registeruser() {
        auth.createUserWithEmailAndPassword(email_,password_).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(signup.this, "Register Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(signup.this, Home.class));
                    finish();
                }
                else
                {
                    Toast.makeText(signup.this, "Error : " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}