package com.androiddaily.framework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androiddaily.framework.databinding.ActivityMainBinding
import com.androiddaily.mvp.v1.ui.BookListActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMvpV1.setOnClickListener {
            startActivity(Intent(this, BookListActivity::class.java))
        }
    }
}