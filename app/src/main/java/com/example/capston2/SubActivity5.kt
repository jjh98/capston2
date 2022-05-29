package com.example.capston2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.capston2.databinding.ActivitySub4Binding
import com.example.capston2.databinding.ActivitySub5Binding

class SubActivity5 : AppCompatActivity() {

    val binding by lazy { ActivitySub5Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}