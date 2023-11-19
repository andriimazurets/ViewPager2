package com.example.viewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewpager2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val images = listOf(
            R.drawable.picture_one,
            R.drawable.picture_two,
            R.drawable.picture_three
        )
        val adapter = ViewPagerAdapter(images)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}