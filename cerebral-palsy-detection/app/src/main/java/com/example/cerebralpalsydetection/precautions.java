package com.example.cerebralpalsydetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class precautions extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.precautions);

        toolbar = findViewById(R.id.ptoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Precautions");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        card1 = (CardView) findViewById(R.id.card1);
        card1.setOnClickListener(this);
        card2 = (CardView) findViewById(R.id.card2);
        card2.setOnClickListener(this);
        card3 = (CardView) findViewById(R.id.card3);
        card3.setOnClickListener(this);
        card4 = (CardView) findViewById(R.id.card4);
        card4.setOnClickListener(this);
        card5 = (CardView) findViewById(R.id.card5);
        card5.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.card1:
                intent = new Intent(this, precaution1.class);
                startActivity(intent);
                break;
            case R.id.card2:
                intent = new Intent(this, precaution2.class);
                startActivity(intent);
                break;
            case R.id.card3:
                intent = new Intent(this, precaution3.class);
                startActivity(intent);
                break;
            case R.id.card4:
                intent = new Intent(this, precaution4.class);
                startActivity(intent);
                break;
            case R.id.card5:
                intent = new Intent(this, precaution5.class);
                startActivity(intent);
        }
    }
}