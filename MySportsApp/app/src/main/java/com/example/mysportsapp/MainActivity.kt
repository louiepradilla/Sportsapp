package com.example.mysportsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment // Required for NavHostFragment
import androidx.navigation.ui.setupWithNavController // Required for setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView // Required for BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This is the minimum code required to display your layout
        setContentView(R.layout.activity_main)

        // 1. Get the NavController from the NavHostFragment
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // 2. Get the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_view)

        // 3. Link the BottomNavigationView to the NavController
        bottomNavigationView.setupWithNavController(navController)
    }
}