package com.example.cerebralpalsydetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Element adsElement = new Element();
        adsElement.setTitle("Advertise Here");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.aboutpage)
                .setDescription("Cerebral Palsy Detection System")
                .addItem(new Element().setTitle("Version 1.0"))
                .addItem(adsElement)
                .addGroup("Connect with Us")
                .addEmail("info@uskt.edu.pk")
                .addWebsite("https://www.uskt.edu.pk/")
                .addFacebook("usktskt/")
                .addInstagram("uskt_sialkot/")
                .addTwitter("uskt_sialkot")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);

    }

    private Element createCopyright() {
        Element copyright = new Element();
        String copyrightString = String.format("Copyright %d by University of Sialkot", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(aboutus.this, copyrightString, Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}