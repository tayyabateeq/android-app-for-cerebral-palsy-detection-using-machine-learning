package com.example.cerebralpalsydetection;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.Calendar;

public class setprofile extends AppCompatActivity{


    TextInputLayout name_p, disease_level_p, age_p, gender_p, weight_p;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setprofile);

        toolbar = findViewById(R.id.sptoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Set Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        name_p = findViewById(R.id.p_name);
        disease_level_p = findViewById(R.id.p_disease_level);
        age_p = findViewById(R.id.p_age);
        gender_p = findViewById(R.id.p_gender);
        weight_p = findViewById(R.id.p_weight);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("MyNotifications", "MyNotification", NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        FirebaseMessaging.getInstance().subscribeToTopic("general")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "Successful";
                        if (!task.isSuccessful()) {
                            msg = "Failed";
                        }
                        Log.d(TAG, msg);
                        //Toast.makeText(setprofile.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });

    }

    public void set_profile_button(View view) {
        String patient_name = name_p.getEditText().getText().toString();
        String patient_diseaselevel = disease_level_p.getEditText().getText().toString();
        String patient_age = age_p.getEditText().getText().toString();
        String patient_gender = gender_p.getEditText().getText().toString();
        String patient_weight = weight_p.getEditText().getText().toString();

        if (!patient_name.isEmpty() || patient_diseaselevel.isEmpty() || patient_age.isEmpty() || patient_gender.isEmpty() || patient_weight.isEmpty()) {
            name_p.setError(null);
            name_p.setErrorEnabled(false);
            disease_level_p.setError(null);
            disease_level_p.setErrorEnabled(false);
            age_p.setError(null);
            age_p.setErrorEnabled(false);
            gender_p.setError(null);
            gender_p.setErrorEnabled(false);
            weight_p.setError(null);
            weight_p.setErrorEnabled(false);

            firebaseDatabase = FirebaseDatabase.getInstance();
            reference = firebaseDatabase.getReference("setprofile");

            String p_name_ = name_p.getEditText().getText().toString();
            String p_diseaselevel_ = disease_level_p.getEditText().getText().toString();
            String p_age_ = age_p.getEditText().getText().toString();
            String p_gender_ = gender_p.getEditText().getText().toString();
            String p_weight_ = weight_p.getEditText().getText().toString();

            profiledata profiledata_p = new profiledata(p_name_, p_diseaselevel_, p_age_, p_gender_, p_weight_);

            reference.child(p_name_).setValue(profiledata_p);

            Toast.makeText(getApplicationContext(), "Register Successfully", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
            finish();
        } else {
            name_p.setError("Data Not Saved");
        }
    }


}