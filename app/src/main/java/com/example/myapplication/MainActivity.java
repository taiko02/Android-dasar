package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// AppCompatActivity : class di android framework  yang menjelaskan activity apa
// dan mewarisi dari class itu untuk mengambil behavior/perilaku
public class MainActivity extends AppCompatActivity {

//    Activity Life Cycle :
//    ActivityIsStarted -> onCreate() -> onStart() -> onResume() -> ActivityRunning -> onPause() -> onStop()
//    -> onRestart() -> onDestroy()

//    onCreate() : Pada tahap onCreate(), Anda biasanya melakukan inisialisasi dasar untuk aktivitas,
//    seperti mengatur tata letak antarmuka pengguna (UI), menghubungkan elemen UI dengan kode Java,
//    dan mempersiapkan data awal. Metode ini menerima parameter Bundle, yang merupakan wadah untuk
//    data yang dikirim dari aktivitas sebelumnya, seperti saat Anda membuka aktivitas baru dari aktivitas lain.

//    onStart() : Setelah metode onCreate() selesai dieksekusi dan aktivitas telah dibuat, aktivitas tersebut akan memasuki tahap onStart().
//    Dalam tahap onStart(), Anda biasanya melakukan persiapan lebih lanjut sebelum aktivitas benar-benar
//    terlihat oleh pengguna. Ini mungkin melibatkan pengaturan data, memulai layanan yang diperlukan, atau mempersiapkan elemen UI tambahan.

//    onResume() : Setelah metode onStart() selesai dieksekusi dan aktivitas mulai terlihat oleh pengguna,
//    aktivitas akan memasuki tahap onResume(). Metode ini dieksekusi ketika aktivitas telah sepenuhnya
//    terlihat oleh pengguna dan pengguna dapat berinteraksi dengannya.
//    Dalam tahap onResume(), Anda biasanya melakukan tugas-tugas seperti mengatur kembali data yang
//    mungkin telah berubah selama aktivitas tidak terlihat, memulai perintah yang memerlukan fokus
//    pengguna, atau memperbarui tampilan jika diperlukan.

//    onPause() : Tahap ini terjadi ketika aktivitas kehilangan fokus atau menjadi tidak terlihat
//    oleh pengguna. Hal ini dapat terjadi ketika pengguna beralih ke aktivitas lain, mengunci perangkat, atau menurunkan notifikasi.
//    Dalam tahap onPause(), Anda biasanya melakukan tugas-tugas untuk mempersiapkan aktivitas untuk
//    menjadi tidak aktif, seperti menyimpan data penting atau memberhentikan proses yang tidak perlu berjalan saat aktivitas tidak terlihat.
//    onPause() terjadi ketika contoh nya membuka aplikasi lain, ketika onpause selesai maka akan di ulang ke onresume

//    onStop() : Tahap ini terjadi ketika aktivitas tidak lagi terlihat oleh pengguna dan sedang dalam
//    proses keluar dari layar atau menghilang sepenuhnya. Ini bisa terjadi ketika pengguna memutuskan
//    untuk menutup aktivitas atau beralih ke aktivitas lain.
//    Dalam tahap onStop(), Anda biasanya melakukan tugas-tugas untuk membersihkan sumber daya atau
//    mematikan proses yang tidak diperlukan lagi ketika aktivitas berhenti. Misalnya, Anda dapat
//    melepaskan sumber daya seperti koneksi jaringan atau perangkat keras yang digunakan oleh aktivitas.
//    jika onStop() lalu proses aplikasi di hentikan maka akan kembali ke onCreate()

//    onRestart : Tahap ini terjadi ketika aktivitas yang telah berhenti (sudah memasuki tahap onStop())
//    akan dimulai kembali oleh sistem. Ini terjadi ketika pengguna kembali ke aktivitas setelah
//    meninggalkannya sementara atau setelah aktivitas selesai dihentikan.
//    Dalam tahap onRestart(), Anda biasanya melakukan persiapan awal sebelum aktivitas memasuki
//    tahap onStart() dan kemudian onResume(). Ini mungkin melibatkan memeriksa dan mempersiapkan
//    ulang data yang diperlukan atau melakukan tugas-tugas lain yang diperlukan sebelum aktivitas kembali terlihat oleh pengguna.

//    onDestroy() : Atcivity di matikan sepenuhnya

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    tekan controll + o untuk override
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}