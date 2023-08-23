package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// AppCompatActivity : class di android framework  yang menjelaskan activity apa
// dan mewarisi dari class itu untuk mengambil behavior/perilaku
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(v -> {
            EditText firstNumber = findViewById(R.id.etFirsNumber);
            EditText secondNumber = findViewById(R.id.etSecondNumber);
            TextView tvResult = findViewById(R.id.tvResult);
            // ParseInt artinya kita mengubah semua value dari EditText lalu di konversi kan ke bilangan bulat.  contoh : "45" -> 45
            Integer result = Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString());

            tvResult.setText(result.toString());
        });
    }
}