package com.example.day3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day3.databinding.ActivityRegstrionBinding

class Regstrion : AppCompatActivity() {
    private lateinit var binding: ActivityRegstrionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityRegstrionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLoginRegstretion.setOnClickListener{
            val intent =Intent(this,Hi::class.java)
            startActivity(intent)
        }
        binding.textView8.setOnClickListener{
            val intent =Intent(this,login::class.java)
            startActivity(intent)
        }
    }
}