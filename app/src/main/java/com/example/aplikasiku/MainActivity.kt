package com.example.aplikasiku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()
        //aktifkan fun delay
        handler.postDelayed(Runnable{
            //intent diaktifkan
            val intent = Intent(this,LoginActivity::class.java)
            //aktifkan intent
            startActivity(intent)
        }, 5000)
        }

    }


