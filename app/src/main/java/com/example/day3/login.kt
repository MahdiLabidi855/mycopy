package com.example.day3

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day3.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val intent =Intent(this,Hi::class.java)
            startActivity(intent)
        }
        binding.tvregister.setOnClickListener {
            val intent =Intent(this,Regstrion::class.java)
            startActivity(intent)
        }

    }
}