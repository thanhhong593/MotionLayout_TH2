package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BabyActivity extends AppCompatActivity {
    private ImageButton img1;
    private ImageView imgBaby;
    private ImageView camera,video,mic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.imageButton);
        imgBaby = findViewById(R.id.imageView);
        camera = findViewById(R.id.imageView2);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.tranferanim);
        Animation tranCamera = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.chuyendong);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBaby.startAnimation(animation);
                camera.startAnimation(tranCamera);
//                video.startAnimation(animation);
//                mic.startAnimation(animation);

            }
        });
    }
}