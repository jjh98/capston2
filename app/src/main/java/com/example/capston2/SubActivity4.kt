package com.example.capston2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capston2.databinding.ActivitySub3Binding
import com.example.capston2.databinding.ActivitySub4Binding

class SubActivity4 : AppCompatActivity() {

    val binding by lazy { ActivitySub4Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var intent = Intent(this, SubActivity5::class.java)
        binding.btnStart.setOnClickListener { startActivity(intent) }
    }
}