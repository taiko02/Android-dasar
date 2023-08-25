package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // contoh penggunaan viewBinding / pengganti findViewById()
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btOpenActivity.setOnClickListener(v -> {
            // agar bisa pindah activity kita perlu mendaftarkan ke manifest
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });

    }
}