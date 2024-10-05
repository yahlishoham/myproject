package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textOpening;
    ImageView imageLogo;
    TextView textFraze;
    Button buttonStart;
    TextView cdtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOpening = findViewById(R.id.textOpening);
        imageLogo = findViewById(R.id.imageLogo);
        textFraze = findViewById(R.id.textFraze);
        buttonStart = findViewById(R.id.buttonStart);
        cdtShow = findViewById(R.id.cdtShow);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent first = new Intent(MainActivity.this , register.class);

                startActivity(first);

            }});
        CountDownTimer moveActivity = new CountDownTimer(7000, 1000) {
            public void onTick(long millisUntilFinished) {
                cdtShow.setText("seconds remaining: " + millisUntilFinished / 1000);
            }
            public void onFinish() {
                Intent first = new Intent(MainActivity.this , login.class);

                startActivity(first);
            }

        }.start();
      }
    }
