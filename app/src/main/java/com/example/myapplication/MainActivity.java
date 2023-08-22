package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// AppCompatActivity : class di android framework  yang menjelaskan activity apa
// dan mewarisi dari class itu untuk mengambil behavior/perilaku
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer[] count = {0};
        Button buttonCount = findViewById(R.id.btnCount);
        TextView tvCount = findViewById(R.id.tvCount);

        buttonCount.setOnClickListener(v -> {
            count[0]++;
            tvCount.setText("lets count new together : " + count[0]);
        });
    }
}