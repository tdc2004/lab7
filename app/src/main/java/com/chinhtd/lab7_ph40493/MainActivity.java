package com.chinhtd.lab7_ph40493;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {
    ImageView quat ;
    TextView fast ;
    TextView medium;
    TextView low ;
    TextView off;
    private static final long DURATION = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quat = findViewById(R.id.quat);
        fast = findViewById(R.id.highButton);
        medium = findViewById(R.id.mediumButton);
        low = findViewById(R.id.lowButton);
        off = findViewById(R.id.offButton);
        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                quat.clearAnimation();
//                quat.startAnimation(animation);
                startFan(100);
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                quat.clearAnimation();
//                quat.startAnimation(animation1);
                startFan(500);
            }
        });
        low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                quat.clearAnimation();
//                quat.startAnimation(animation2);
                startFan(1000);
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                quat.clearAnimation();
                stopFan();
            }
        });
        startFan(DURATION);

    }
    private void startFan(long time){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                quat.animate().rotationBy(360).withEndAction(this).setDuration(time).setInterpolator(new LinearInterpolator()).start();
            }
        };
        quat.animate().rotationBy(360).withEndAction(runnable).setDuration(time).setInterpolator(new LinearInterpolator()).start();
    }
    private void stopFan() {
        quat.animate().cancel();
    }
}