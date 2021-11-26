package com.mintic.tienda.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.mintic.tienda.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startTimer()
    }

    fun startTimer() {
        object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                TODO("Not yet implemented")
            }

            override fun onFinish() {
                val intent = Intent(applicationContext, PrincipalActivity::class.java).apply {}
                startActivity(intent)


            }
        }.start()
    }
}