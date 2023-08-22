package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

// AppCompatActivity : class di android framework  yang menjelaskan activity apa
// dan mewarisi dari class itu untuk mengambil behavior/perilaku
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // contoh penggunaan dari view ke main file
        // Tipe data nya sesuaikan tipe di xml nya
        Button btnApply = findViewById(R.id.btnApply);
        btnApply.setOnClickListener(new View.OnClickListener() {
            private final EditText firstName = findViewById(R.id.etFirstName);
            private final EditText lastName = findViewById(R.id.etLastName);
            private final EditText birthDay = findViewById(R.id.etBirthDay);
            private final EditText country = findViewById(R.id.etCountry);

            @Override
            public void onClick(View v) {
                // mencetak ke console
                Log.d("Main activity", "First name " + firstName.getText().toString() +
                        " " + lastName.getText().toString() + ", " +
                        "born on : " + birthDay.getText().toString() +
                        ", from " + country.getText().toString());
            }
        });
    }
}