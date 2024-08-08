package com.alvinsaputra.bandungcreativeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.alvinsaputra.bandungcreativeapp.databinding.ActivityMainBinding
import com.alvinsaputra.bandungcreativeapp.ui.facilities.FacilitiesFragment
import com.alvinsaputra.bandungcreativeapp.ui.map.MapFragment
import com.alvinsaputra.bandungcreativeapp.ui.reviews.ReviewsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load MapFragment di awal
        if (savedInstanceState == null) {
            loadFragment(MapFragment())
        }

        // Setup NavigationView
        binding.navView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_map -> {
                    loadFragment(MapFragment())
                    true
                }
                R.id.navigation_facilities -> {
                    loadFragment(FacilitiesFragment())
                    true
                }
                R.id.navigation_reviews -> {
                    loadFragment(ReviewsFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
