package com.example.myapplication

import java.io.Serializable

//data class : kelas yang tujuan utamanya adalah menampung data.
//Kelas data hadir secara otomatis dengan fungsi anggota tambahan yang memungkinkan Anda mencetak
// sebuah instance ke output yang dapat dibaca, membandingkan instance, menyalin instance, dan banyak lagi.
data class Person(
    val name: String,
    val country: String,
    val age: Int
) : Serializable
// Serializable: proses mengubah data yang digunakan oleh aplikasi ke format yang dapat ditransfer
// melalui jaringan atau disimpan dalam database atau file.