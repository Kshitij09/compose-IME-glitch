package com.kshitijpatil.imeexp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.fragment.app.FragmentActivity
import com.kshitijpatil.imeexp.databinding.ActivityMainBinding
import dev.chrisbanes.insetter.applySystemWindowInsetsToPadding

class MainActivity : FragmentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //binding.root.applySystemWindowInsetsToPadding()
        setContentView(binding.root)
        // This app draws behind the system bars, so we want to handle fitting system windows
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}