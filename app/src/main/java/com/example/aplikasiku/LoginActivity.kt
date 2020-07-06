package com.example.aplikasiku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btn_login)
        //ketika tombol diklik
        btnLogin.setOnClickListener {

      //      Toast.makeText(this,"Tombol telah diklik",Toast.LENGTH_SHORT).show()

            val linkToHome =  Intent(this, HomeActivity::class.java)
            startActivity(linkToHome)
        }
    }
}
