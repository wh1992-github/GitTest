package com.example.myapplication;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ActivityMainBinding mViewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());

        Log.i(TAG, "onCreate: " + getResources().getDimension(R.dimen.dp_100));
        Log.i(TAG, "onCreate: " + getResources().getDimensionPixelSize(R.dimen.dp_100));
        Log.i(TAG, "onCreate: " + getResources().getDimensionPixelOffset(R.dimen.dp_100));

        mViewBinding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewBinding.iv.setImageResource(R.drawable.music_player_pause);
                mViewBinding.iv.setVisibility(View.VISIBLE);
                mViewBinding.pb.setVisibility(View.INVISIBLE);
            }
        });
        mViewBinding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewBinding.iv.setImageResource(R.drawable.music_player_play);
                mViewBinding.iv.setVisibility(View.VISIBLE);
                mViewBinding.pb.setVisibility(View.INVISIBLE);
            }
        });
        mViewBinding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewBinding.iv.setVisibility(View.INVISIBLE);
                mViewBinding.pb.setVisibility(View.VISIBLE);
            }
        });
    }
}