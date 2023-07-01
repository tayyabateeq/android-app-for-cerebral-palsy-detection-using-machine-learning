package com.example.cerebralpalsydetection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Home extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    public CardView card1, card2, card3, card4, card5, card6;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    FirebaseAuth auth = FirebaseAuth.getInstance();
    FirebaseUser user = auth.getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

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

        card6 = (CardView) findViewById(R.id.card6);
        card6.setOnClickListener(this);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);

        navigationView.bringToFront();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (user == null)
        {
            startActivity(new Intent(this, login.class));
            finish();
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.card1:
                intent = new Intent(this,diseasedetection.class);
                startActivity(intent);
                break;
            case R.id.card2:
                intent = new Intent(this,setprofile.class);
                startActivity(intent);
                break;
            case R.id.card3:
                intent = new Intent(this,suggest.class);
                startActivity(intent);
                break;
            case R.id.card4:
                intent = new Intent(this,precautions.class);
                startActivity(intent);
                break;
            case R.id.card5:
                intent = new Intent(this,LearningSystems.class);
                startActivity(intent);
                break;
            case R.id.card6:
                intent = new Intent(this,aboutus.class);
                startActivity(intent);
                break;
        }


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.home_menu:
                break;
            case R.id.profile_menu:
                Intent intent = new Intent(this,userpofile.class);
                startActivity(intent);
                break;
            case R.id.logout_menu:
                auth.signOut();
                startActivity(new Intent(this, login.class));
                finish();
                break;
            case R.id.contact_menu:
                Intent intent2 = new Intent(this,aboutus.class);
                startActivity(intent2);
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}