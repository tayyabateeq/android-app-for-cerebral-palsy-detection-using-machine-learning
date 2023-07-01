package com.example.cerebralpalsydetection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class viewdoctors extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    private Button callbtn, callbtn1, callbtn2, callbtn3, callbtn4, callbtn5, callbtn6;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewdoctors);

        toolbar = findViewById(R.id.vttoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("View Therapists");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        callbtn = findViewById(R.id.callbtn1);
        callbtn1 = findViewById(R.id.callbtn2);
        callbtn2 = findViewById(R.id.callbtn3);
        callbtn3 = findViewById(R.id.callbtn4);
        callbtn4 = findViewById(R.id.callbtn5);
        callbtn5 = findViewById(R.id.callbtn6);
        callbtn6 = findViewById(R.id.callbtn7);

        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton();
            }
        });

        callbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton1();
            }
        });

        callbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton2();
            }
        });

        callbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton3();
            }
        });

        callbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton4();
            }
        });
        callbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton5();
            }
        });

        callbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton6();
            }
        });


    }

    private void CallButton() {
        String number = "+921234567890";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewdoctors.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewdoctors.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton1() {
        String number = "03182231954";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewdoctors.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewdoctors.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton2() {
        String number = "0415068104";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewdoctors.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewdoctors.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton3() {
        String number = "0415068104";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewdoctors.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewdoctors.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton4() {
        String number = "03100002273";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewdoctors.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewdoctors.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton5() {
        String number = "03214483633";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewdoctors.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewdoctors.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton6() {
        String number = "0423890939";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewdoctors.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewdoctors.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                CallButton();
                CallButton1();
                CallButton2();
                CallButton3();
                CallButton4();
                CallButton5();
                CallButton6();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }
}