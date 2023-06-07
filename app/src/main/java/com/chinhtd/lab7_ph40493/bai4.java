package com.chinhtd.lab7_ph40493;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class bai4 extends AppCompatActivity {
    ImageView quat ;
    TextView fast ;
    TextView medium;
    TextView low ;
    TextView off;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        quat = findViewById(R.id.quat1);
        fast = findViewById(R.id.highButton1);
        medium = findViewById(R.id.mediumButton1);
        low = findViewById(R.id.lowButton1);
        off = findViewById(R.id.offButton1);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.high_speed_animation);
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.medium_speed_animotion);
        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.low_speed_animotion);

        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quat.clearAnimation();
                quat.startAnimation(animation);
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quat.clearAnimation();
                quat.startAnimation(animation1);
            }
        });
        low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quat.clearAnimation();
                quat.startAnimation(animation2);
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quat.clearAnimation();
            }
        });
    }
}