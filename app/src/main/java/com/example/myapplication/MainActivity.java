package com.example.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

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

        binding.btnOrder.setOnClickListener(v -> {
            int checkMeatRadioButtonId = binding.rgMeat.getCheckedRadioButtonId();
            RadioButton meat = findViewById(checkMeatRadioButtonId);
            boolean cheese = binding.cbCheese.isChecked();
            boolean onion = binding.cbOnion.isChecked();
            boolean salad = binding.cbSalad.isChecked();
            String orderSting = "Your order burger with : \n " +
                    meat.getText() +
                    (cheese ? "\nCheese" : "") +
                    (onion ? "\nOnion" : "") +
                    (salad ? "\nSalad" : "");
            binding.tvOrder.setText(orderSting);

        });
    }
}