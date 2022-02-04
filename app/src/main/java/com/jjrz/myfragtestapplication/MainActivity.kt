package com.jjrz.myfragtestapplication

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.jjrz.myfragtestapplication.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = inflate(LayoutInflater.from(this))
        val view = binding.root
        setContentView(view)
        var viewModel = ViewModelProvider(this).get(BlankFragment1ViewModel::class.java)
    }
}