package com.example.cerebralpalsydetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class diseasedetection extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diseasedetection);

        toolbar = findViewById(R.id.ddtoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Disease Detection");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        card1 = (CardView) findViewById(R.id.card1);
        card1.setOnClickListener(this);

        card2 = (CardView) findViewById(R.id.card2);
        card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.card1:
                intent = new Intent(this, uploadimage.class);
                startActivity(intent);
                break;
            case R.id.card2:
                intent = new Intent(this, quizsection.class);
                startActivity(intent);
        }
    }
}