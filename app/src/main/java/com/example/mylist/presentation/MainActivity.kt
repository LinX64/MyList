package com.example.mylist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylist.R
import com.example.mylist.presentation.main.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
    }

    private fun setupViews() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view, MainFragment())
            .commit()
    }
}