package com.example.myapplication12345

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myapplication12345.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val dataModel: DataModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fg1, BlankFragment.newInstance()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.fg2, BlankFragment2.newInstance()).commit()
        dataModel.message.observe(this, {
            binding.textView.text = it
        })
    }
}