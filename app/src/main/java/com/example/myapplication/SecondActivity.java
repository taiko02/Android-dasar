package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    // cara memnambahkan viewBinding baru ke activity baru dengan cara
    // di file layout->nama.xml = tambahkan tools:context=".NamaFileActivity.java/kt"
    // maka bisa di panggil dengan cara dibawah ini
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btBack.setOnClickListener(v -> {
            finish(); // digunakan untuk mengakhiri atau menghancurkan acivity saat ini.
        });

        binding.btnNextActivity.setOnClickListener(v -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });
    }
}
