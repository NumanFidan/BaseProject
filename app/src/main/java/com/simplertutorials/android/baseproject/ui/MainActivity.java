package com.simplertutorials.android.baseproject.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.simplertutorials.android.baseproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
