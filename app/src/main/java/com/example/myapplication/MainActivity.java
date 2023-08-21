package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

// AppCompatActivity : class di android framework  yang menjelaskan activity apa
// dan mewarisi dari class itu untuk mengambil behavior/perilaku
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//  untuk mencari error bisa menggunakan logcat dibawah dekt profiler
//  VERBOSE: Ini adalah tingkat log paling rendah dan digunakan untuk mencatat detail yang sangat
//  rinci. Pesan log ini biasanya digunakan selama tahap debugging intensif dan mungkin mencakup
//  informasi seperti nilai variabel, aliran eksekusi, dll.
//
//  DEBUG: Tingkat log ini digunakan untuk pesan log yang membantu dalam proses debugging. Ini mencakup
//  informasi yang bermanfaat saat mengidentifikasi masalah dan memahami alur eksekusi.
//
//  INFO: Pesan log pada tingkat ini memberikan informasi umum tentang alur kerja aplikasi. Ini bisa
//  mencakup tindakan-tindakan yang dilakukan oleh aplikasi atau kejadian-kejadian penting.
//
//  WARN: Pesan log tingkat ini menunjukkan kondisi yang mungkin menyebabkan masalah di masa depan,
//  tetapi aplikasi masih dapat berjalan. Ini mungkin termasuk peringatan tentang penggunaan yang tidak efisien atau kondisi tidak diharapkan.
//
//  ERROR: Ini adalah tingkat log yang menunjukkan situasi yang mengindikasikan kesalahan dalam aplikasi.
//  Pesan log ini menunjukkan bahwa sesuatu telah salah dan perlu diperbaiki.
//
//  ASSERT: Tingkat log ini paling tinggi dan digunakan untuk situasi di mana pemrogram berpendapat
//  bahwa kondisi yang seharusnya tidak pernah terjadi telah terjadi. Biasanya digunakan dalam pemeriksaan
//  yang sangat penting untuk memastikan aplikasi beroperasi dengan benar.
}