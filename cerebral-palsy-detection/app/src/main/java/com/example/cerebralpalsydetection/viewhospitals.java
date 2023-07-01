package com.example.cerebralpalsydetection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class viewhospitals extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    private Button callbutton1, callbutton2, callbutton3, callbutton4, callbutton5, callbutton6, callbutton7;
    private Button directionbutton1, directionbutton2, directionbutton3, directionbutton4, directionbutton5, directionbutton6, directionbutton7;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewhospitals);

        toolbar = findViewById(R.id.vhtoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("View Hospitals");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        callbutton1 = findViewById(R.id.callbutton1);
        callbutton2 = findViewById(R.id.callbutton2);
        callbutton3 = findViewById(R.id.callbutton3);
        callbutton4 = findViewById(R.id.callbutton4);
        callbutton5 = findViewById(R.id.callbutton5);
        callbutton6 = findViewById(R.id.callbutton6);
        callbutton7 = findViewById(R.id.callbutton7);

        directionbutton1 = findViewById(R.id.directionbutton1);
        directionbutton2 = findViewById(R.id.directionbutton2);
        directionbutton3 = findViewById(R.id.directionbutton3);
        directionbutton4 = findViewById(R.id.directionbutton4);
        directionbutton5 = findViewById(R.id.directionbutton5);
        directionbutton6 = findViewById(R.id.directionbutton6);
        directionbutton7 = findViewById(R.id.directionbutton7);


        callbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton1();
            }
        });

        callbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton2();
            }
        });

        callbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton3();
            }
        });

        callbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton4();
            }
        });
        callbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton5();
            }
        });

        callbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton6();
            }
        });
        callbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallButton7();
            }
        });

        directionbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String source = "Sialkot";
                String destination = "Sialkot";
                displaydirection1(source, destination);
            }
        });
        directionbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String source = "Sialkot";
                String destination = "Gujranwala";
                displaydirection2(source, destination);
            }
        });
        directionbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String source = "Sialkot";
                String destination = "Gujranwala";
                displaydirection3(source, destination);
            }
        });
        directionbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String source = "Sialkot";
                String destination = "Gujranwala";
                displaydirection4(source, destination);
            }
        });
        directionbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String source = "Sialkot";
                String destination = "Lahore";
                displaydirection5(source, destination);
            }
        });
        directionbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String source = "Sialkot";
                String destination = "Lahore";
                displaydirection6(source, destination);
            }
        });
        directionbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String source = "Sialkot";
                String destination = "Lahore";
                displaydirection7(source, destination);
            }
        });
    }


    private void CallButton1() {
        String number = "0523301101";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewhospitals.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewhospitals.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton2() {
        String number = "0415068104";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewhospitals.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewhospitals.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton3() {
        String number = "0553863333";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewhospitals.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewhospitals.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton4() {
        String number = "0553840505";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewhospitals.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewhospitals.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton5() {
        String number = "04232591427";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewhospitals.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewhospitals.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton6() {
        String number = "+923111222398 ";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewhospitals.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewhospitals.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void CallButton7() {
        String number = "03354619275";
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(viewhospitals.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(viewhospitals.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                CallButton1();
                CallButton2();
                CallButton3();
                CallButton4();
                CallButton5();
                CallButton6();
                CallButton7();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void displaydirection1(String source, String destination) {
        try {

            Uri uri = Uri.parse("http://www.google.com.pk/maps/dir/" + source + "/" + destination);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    private void displaydirection2(String source, String destination) {
        try {

            Uri uri = Uri.parse("http://www.google.com.pk/maps/dir/" + source + "/" + destination);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    private void displaydirection3(String source, String destination) {
        try {

            Uri uri = Uri.parse("http://www.google.com.pk/maps/dir/" + source + "/" + destination);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    private void displaydirection4(String source, String destination) {
        try {

            Uri uri = Uri.parse("http://www.google.com.pk/maps/dir/" + source + "/" + destination);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    private void displaydirection5(String source, String destination) {
        try {

            Uri uri = Uri.parse("http://www.google.com.pk/maps/dir/" + source + "/" + destination);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    private void displaydirection6(String source, String destination) {
        try {

            Uri uri = Uri.parse("http://www.google.com.pk/maps/dir/" + source + "/" + destination);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    private void displaydirection7(String source, String destination) {
        try {

            Uri uri = Uri.parse("http://www.google.com.pk/maps/dir/" + source + "/" + destination);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}