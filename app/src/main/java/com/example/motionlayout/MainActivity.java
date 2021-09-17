package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img1;
    private ImageView imgBaby;
    private ImageButton camera,video,mic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.image1);
        imgBaby = findViewById(R.id.imgBaby);
//        camera = findViewById(R.id.imageView3);
//        video = findViewById(R.id.imageView4);
//        mic = findViewById(R.id.imageView5);
        TranslateAnimation animation= new TranslateAnimation(0,200,0,500);
        animation.setDuration(6000);
        animation.setFillAfter(true);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBaby.startAnimation(animation);
//                camera.startAnimation(animation);
//                video.startAnimation(animation);
//                mic.startAnimation(animation);

            }
        });
    }
}