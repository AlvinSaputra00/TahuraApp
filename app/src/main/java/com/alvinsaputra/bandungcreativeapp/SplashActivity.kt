package com.alvinsaputra.bandungcreativeapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash_activity)

        // Menghilangkan Action Bar
        supportActionBar?.hide()

        // Delay untuk pindah ke MainActivity
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menghapus SplashActivity dari stack
        }, 3000) // 3 detik delay
    }
}
