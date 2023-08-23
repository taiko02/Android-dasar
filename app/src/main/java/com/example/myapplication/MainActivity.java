package com.example.myapplication;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

// AppCompatActivity : class di android framework  yang menjelaskan activity apa
// dan mewarisi dari class itu untuk mengambil behavior/perilaku
public class MainActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddImage = findViewById(R.id.btnAddImage);

        btnAddImage.setOnClickListener(v -> {
            ImageView ivImage = findViewById(R.id.ivImage);

            ivImage.setImageResource(R.drawable.fotos);
        });
    }
}