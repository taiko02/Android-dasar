package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // contoh penggunaan viewBinding / pengganti findViewById()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.btnApply.setOnClickListener {
            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val country = binding.etCountry.text.toString()
            val person = Person(name,country,age)

            Intent(this,SecondAcitivity::class.java).also {
                it.putExtra("EXTRA_PERSON",person) //person merupakan tipe object seriazable yang kita buat di data class

                // cara dibawah ini adalah cara tanpa data class
//                it.putExtra("EXTRA_NAME",name)
//                it.putExtra("EXTRA_AGE", age)
//                it.putExtra("EXTRA_COUNTRY", country)
                startActivity(it)
            }
        }


    }
}