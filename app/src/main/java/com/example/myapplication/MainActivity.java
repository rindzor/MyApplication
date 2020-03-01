package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image_our_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "imageView pressed!!!");
                v.setVisibility(View.GONE);
            }
        });

        ImageView imageView2 = findViewById(R.id.image_our_view2);
        imageView2.setBackgroundColor(Color.argb(255, 155, 55, 255));
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "imageView pressed!!!");
                v.setVisibility(View.GONE);
            }
        });

        ImageView imageView3 = findViewById(R.id.image_our_view3);
        imageView3.setBackgroundColor(Color.argb(255, 155, 5, 55));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "imageView pressed!!!");
                v.setVisibility(View.GONE);
            }
        });

        ImageView imageView4 = findViewById(R.id.image_our_view4);
        imageView4.setBackgroundColor(Color.argb(255, 55, 1, 1));
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "imageView pressed!!!");
                v.setVisibility(View.GONE);
            }
        });

        ImageView imageView5 = findViewById(R.id.image_our_view5);
        imageView5.setBackgroundColor(Color.argb(255, 1, 250, 1));
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "imageView pressed!!!");
                v.setVisibility(View.GONE);
            }
        });

        ImageView imageView6 = findViewById(R.id.image_our_view6);
        imageView6.setBackgroundColor(Color.argb(255, 1, 1, 250));
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "imageView pressed!!!");
                v.setVisibility(View.GONE);
            }
        });

        ImageView imageView7 = findViewById(R.id.image_our_view7);
        imageView7.setBackgroundColor(Color.argb(255, 20, 150, 250));
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "imageView pressed!!!");
                v.setVisibility(View.GONE);
            }
        });

        ImageView imageView8 = findViewById(R.id.image_our_view8);
        imageView8.setBackgroundColor(Color.argb(255, 20, 250, 150));
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "imageView pressed!!!");
                v.setVisibility(View.GONE);
            }
        });

    }
}
