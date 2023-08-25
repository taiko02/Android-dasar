package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondAcitivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person // cast ke class person

        // contoh get value intent tanpa class data
//        val name = intent.getStringExtra("EXTRA_NAME")
//        val age = intent.getIntExtra("EXTRA_AGE",0)
//        //contoh intent dengan integer / tipe data selain string harus menambahkan default value
//        val country = intent.getStringExtra("EXTRA_COUNTRY")

        val personString = "Nama : ${person.name} Umur : ${person.age} Negara : ${person.country}"

        binding.tvPerson.text = personString

    }
}