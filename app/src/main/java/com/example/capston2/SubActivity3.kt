package com.example.capston2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capston2.databinding.ActivitySub3Binding

class SubActivity3 : AppCompatActivity() {

    val binding by lazy { ActivitySub3Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var intent = Intent(this, SubActivity4::class.java)
        binding.btnStart.setOnClickListener { startActivity(intent) }
    }
}