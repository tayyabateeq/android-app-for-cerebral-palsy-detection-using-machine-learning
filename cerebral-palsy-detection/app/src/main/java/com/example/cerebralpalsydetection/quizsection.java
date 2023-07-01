package com.example.cerebralpalsydetection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class quizsection extends AppCompatActivity {

    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6, radioGroup7, radioGroup8, radioGroup9, radioGroup10;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8, radioButton9, radioButton10;
    Button button;

    int correct = 0;
    int wrong = 0;

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizsection);

        toolbar = findViewById(R.id.qstoolbar);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Quiz Section");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        radioGroup1 = findViewById(R.id.r1);
        radioGroup2 = findViewById(R.id.r2);
        radioGroup3 = findViewById(R.id.r3);
        radioGroup4 = findViewById(R.id.r4);
        radioGroup5 = findViewById(R.id.r5);
        radioGroup6 = findViewById(R.id.r6);
        radioGroup7 = findViewById(R.id.r7);
        radioGroup8 = findViewById(R.id.r8);
        radioGroup9 = findViewById(R.id.r9);
        radioGroup10 = findViewById(R.id.r10);
        button = findViewById(R.id.quizfinish);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedID1 = radioGroup1.getCheckedRadioButtonId();
                radioButton1 = findViewById(selectedID1);
                String checkstring1 = (String) radioButton1.getText();

                int button_g1 = R.id.q1y;

                if (selectedID1 == button_g1) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID2 = radioGroup2.getCheckedRadioButtonId();
                radioButton2 = findViewById(selectedID2);
                String checkstring2 = (String) radioButton2.getText();

                int button_g2 = R.id.q2y;

                if (selectedID2 == button_g2) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID3 = radioGroup3.getCheckedRadioButtonId();
                radioButton3 = findViewById(selectedID3);
                String checkstring3 = (String) radioButton3.getText();

                int button_g3 = R.id.q3y;

                if (selectedID3 == button_g3) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID4 = radioGroup4.getCheckedRadioButtonId();
                radioButton4 = findViewById(selectedID4);
                String checkstring4 = (String) radioButton4.getText();

                int button_g4 = R.id.q4y;

                if (selectedID4 == button_g4) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID5 = radioGroup5.getCheckedRadioButtonId();
                radioButton5 = findViewById(selectedID5);
                String checkstring5 = (String) radioButton5.getText();

                int button_g5 = R.id.q5y;

                if (selectedID5 == button_g5) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID6 = radioGroup6.getCheckedRadioButtonId();
                radioButton6 = findViewById(selectedID6);
                String checkstring6 = (String) radioButton6.getText();

                int button_g6 = R.id.q6y;

                if (selectedID6 == button_g6) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID7 = radioGroup7.getCheckedRadioButtonId();
                radioButton7 = findViewById(selectedID7);
                String checkstring7 = (String) radioButton7.getText();

                int button_g7 = R.id.q7y;

                if (selectedID7 == button_g7) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID8 = radioGroup8.getCheckedRadioButtonId();
                radioButton8 = findViewById(selectedID8);
                String checkstring8 = (String) radioButton8.getText();

                int button_g8 = R.id.q8y;

                if (selectedID8 == button_g8) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID9 = radioGroup9.getCheckedRadioButtonId();
                radioButton9 = findViewById(selectedID9);
                String checkstring9 = (String) radioButton9.getText();

                int button_g9 = R.id.q9y;

                if (selectedID9 == button_g9) {
                    correct++;
                } else {
                    wrong++;
                }

                int selectedID10 = radioGroup10.getCheckedRadioButtonId();
                radioButton10 = findViewById(selectedID10);
                String checkstring10 = (String) radioButton10.getText();

                int button_g10 = R.id.q10y;

                if (selectedID10 == button_g10) {
                    correct++;
                } else {
                    wrong++;
                }


                if (correct > 7 && correct <= 10) {
                    //Toast.makeText(quizsection.this, "Severe Stage of Cerebral Palsy Detected", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(quizsection.this, quizresults.class);
                    startActivity(intent);
                    finish();
                }
                if (correct > 5 && correct <= 7) {
                    //Toast.makeText(quizsection.this, "Moderate Stage of Cerebral Palsy Detected", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(quizsection.this, quizresults2.class);
                    startActivity(intent);
                    finish();
                }
                if (correct > 3 && correct <= 5) {
                    //Toast.makeText(quizsection.this, "Mild Stage of Cerebral Palsy Detected", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(quizsection.this, quizresults3.class);
                    startActivity(intent);
                    finish();
                }
                if (correct >= 1 && correct <= 3) {
                    //Toast.makeText(quizsection.this, "Cerebral Palsy Not Detected", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(quizsection.this, Home.class);
                    startActivity(intent);
                    finish();


                }
            }
        });
    }
}