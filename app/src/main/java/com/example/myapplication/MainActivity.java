package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // contoh penggunaan viewBinding / pengganti findViewById()
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView sebelumnya akan digantikan oleh ViewBinding
        // lalu di inisialisasi di sini
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.showToast.setOnClickListener(v -> {
            // NORMAL TOAST
            //Toast.makeText(getApplicationContext(), "Hi iam toast", Toast.LENGTH_LONG).show();

            // CUSTOM TOAST
            // Membuat instance LayoutInflater
            LayoutInflater li = getLayoutInflater();
            // Mendapatkan objek View seperti yang ditentukan dalam file custom_toast.xml
            View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.clToast));

            // membuat toast object
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        });
    }
}