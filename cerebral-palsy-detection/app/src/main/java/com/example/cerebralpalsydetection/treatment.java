package com.example.cerebralpalsydetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class treatment extends AppCompatActivity {

    TextView detailsText1, detailsText2, detailsText3, detailsText4, detailsText5, detailsText6;
    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treatment);

        toolbar = findViewById(R.id.ttoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Treatment Modalities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        detailsText1 = findViewById(R.id.details1);
        detailsText2 = findViewById(R.id.details2);
        detailsText3 = findViewById(R.id.details3);
        detailsText4 = findViewById(R.id.details4);
        detailsText5 = findViewById(R.id.details5);
        detailsText6 = findViewById(R.id.details6);
        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);
        layout4 = findViewById(R.id.layout4);
        layout5 = findViewById(R.id.layout5);
        layout6 = findViewById(R.id.layout6);

    }

    public void expand1(View view) {
        int v = (detailsText1.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout1, new AutoTransition());
        detailsText1.setVisibility(v);

    }

    public void expand2(View view) {
        int v = (detailsText2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        detailsText2.setVisibility(v);
    }

    public void expand3(View view) {
        int v = (detailsText3.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        detailsText3.setVisibility(v);
    }

    public void expand4(View view) {
        int v = (detailsText4.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());
        detailsText4.setVisibility(v);
    }

    public void expand5(View view) {
        int v = (detailsText5.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout5, new AutoTransition());
        detailsText5.setVisibility(v);
    }

    public void expand6(View view) {
        int v = (detailsText6.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(layout6, new AutoTransition());
        detailsText6.setVisibility(v);
    }
}