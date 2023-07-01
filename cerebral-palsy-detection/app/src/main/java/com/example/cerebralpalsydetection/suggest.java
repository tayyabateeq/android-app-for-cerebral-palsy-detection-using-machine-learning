package com.example.cerebralpalsydetection;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.navigation.NavigationView;

public class suggest extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suggest);

        toolbar = findViewById(R.id.stoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Suggestions");
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
                intent = new Intent(this, viewhospitals.class);
                startActivity(intent);
                break;
            case R.id.card2:
                intent = new Intent(this, viewdoctors.class);
                startActivity(intent);
        }
    }
}