package com.example.cerebralpalsydetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class userpofile extends AppCompatActivity {

    private TextView userfullname, useremail, usermobile;
    private Button updatebutton;

    FirebaseAuth auth = FirebaseAuth.getInstance();
    FirebaseUser user = auth.getCurrentUser();

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userpofile);

        toolbar = findViewById(R.id.usertoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("User Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        userfullname = findViewById(R.id.userprofilefullname);
        useremail = findViewById(R.id.userprofileemail);

        updatebutton = findViewById(R.id.updateprofilebtn);

        if (user != null) {
            userfullname.setText(user.getDisplayName());
            useremail.setText(user.getEmail());
        }
        updatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(userpofile.this, updateprofile.class));
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (user == null) {
            startActivity(new Intent(this, login.class));
            finish();

        }
    }
}