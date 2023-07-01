package com.example.cerebralpalsydetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


public class learningsystem extends AppCompatActivity implements View.OnClickListener {

    public CardView vid1, vid2, vid3, vid4;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learningsystem);

        toolbar = findViewById(R.id.lstoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Learning Video Tutorials");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        vid1 = (CardView) findViewById(R.id.video1);
        vid1.setOnClickListener(this);

        vid2 = (CardView) findViewById(R.id.video2);
        vid2.setOnClickListener(this);

        vid3 = (CardView) findViewById(R.id.video3);
        vid3.setOnClickListener(this);

        vid4 = (CardView) findViewById(R.id.video4);
        vid4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.video1:
                intent = new Intent(this, learningvideos.class);
                startActivity(intent);
                break;
            case R.id.video2:
                intent = new Intent(this, learningvideos2.class);
                startActivity(intent);
                break;
            case R.id.video3:
                intent = new Intent(this, learningvideos3.class);
                startActivity(intent);
                break;
            case R.id.video4:
                intent = new Intent(this, learningvideos4.class);
                startActivity(intent);
                break;
        }

    }
}