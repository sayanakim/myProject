package com.sayana.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private val ITEM = "item"
private val FIRST_FRAGMENT = FirstFragment().javaClass.name
private val SECOND_FRAGMENT = SecondFragment().javaClass.name
private val THIRD_FRAGMENT = ThirdFragment().javaClass.name

class MainActivity : AppCompatActivity() {

    lateinit var navMenu : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navMenu = findViewById(R.id.bottom_navigation_menu)

        navMenu.setOnItemSelectedListener { item ->

            var fragment: Fragment? = null

                if (savedInstanceState != null) {
                    when (item.itemId) {
                        R.id.fragment_first -> {
                            fragment = supportFragmentManager.getFragment(
                                savedInstanceState, FIRST_FRAGMENT
                            ) ?: FirstFragment()
                        }
                        R.id.fragment_second -> {
                            fragment = supportFragmentManager.getFragment(
                                savedInstanceState, SECOND_FRAGMENT
                            ) ?: SecondFragment()
                        }
                        R.id.fragment_third -> {
                            fragment = supportFragmentManager.getFragment(
                                savedInstanceState, THIRD_FRAGMENT
                            ) ?: ThirdFragment()
                        }
                    }
                }
                else {
                    when (item.itemId) {

                        R.id.fragment_first -> fragment = FirstFragment()
                        R.id.fragment_second -> fragment = SecondFragment()
                        R.id.fragment_third -> fragment = ThirdFragment()

                }
            }

            replaceFragment(fragment!!)
            true
        }
        navMenu.selectedItemId =
            savedInstanceState?.getInt(ITEM) ?: R.id.fragment_first
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(ITEM, navMenu.selectedItemId)

        val currentFragment = supportFragmentManager.fragments.last()
        supportFragmentManager.putFragment(
            outState,
            currentFragment.javaClass.name,
            currentFragment
        )
    }


    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}