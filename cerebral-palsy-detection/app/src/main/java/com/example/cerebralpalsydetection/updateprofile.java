package com.example.cerebralpalsydetection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class updateprofile extends AppCompatActivity {

    TextInputLayout updfullname, updemail, updpassword;
    Button updatename, updateemail, updatepassword;

    private FirebaseAuth auth = FirebaseAuth.getInstance();
    private FirebaseUser user = auth.getCurrentUser();
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updateprofile);

        toolbar = findViewById(R.id.uptoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Update Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        updfullname = findViewById(R.id.fullname_field);
        updemail = findViewById(R.id.email_field);
        updpassword = findViewById(R.id.password_field);
        updatename = findViewById(R.id.updateName);
        updateemail = findViewById(R.id.updateEmail);
        updatepassword = findViewById(R.id.updatePassword);

        updatename.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updatename();
            }
        });

        updateemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.updateEmail(updemail.getEditText().getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful())
                                {
                                    Toast.makeText(updateprofile.this,"Email Updated", Toast.LENGTH_SHORT).show();
                                    auth.signOut();
                                    startActivity(new Intent(updateprofile.this, Home.class));
                                    finish();
                                }
                                else
                                {
                                    Toast.makeText(updateprofile.this, task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        updatepassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.updatePassword(updpassword.getEditText().getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful())
                                {
                                    Toast.makeText(updateprofile.this,"Password Updated", Toast.LENGTH_SHORT).show();
                                    auth.signOut();
                                    startActivity(new Intent(updateprofile.this, Home.class));
                                    finish();
                                }
                                else
                                {
                                    Toast.makeText(updateprofile.this, task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

    }


    private void updatename() {
        UserProfileChangeRequest updateProfile = new UserProfileChangeRequest.Builder()
                .setDisplayName(updfullname.getEditText().getText().toString())
                .build();

        user.updateProfile(updateProfile).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(updateprofile.this, "Profile Updated", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(updateprofile.this, Home.class));
                    finish();
                } else {
                    Toast.makeText(updateprofile.this, "Error : " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }



}