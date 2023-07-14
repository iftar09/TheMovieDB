package com.kopikode.themoviedb


import TVFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieFragment = MovieFragment()
        val tvFragment = TVFragment()

        makeCurrentFragment (movieFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bot_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_movie -> makeCurrentFragment(movieFragment)
                R.id.menu_tv -> makeCurrentFragment(tvFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}