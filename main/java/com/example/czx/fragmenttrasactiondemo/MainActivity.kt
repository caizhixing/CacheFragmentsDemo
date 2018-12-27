package com.example.czx.fragmenttrasactiondemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            val currentFragment = supportFragmentManager.findFragmentById(R.id.wrapper)
            if(currentFragment is FragmentOne){
                Log.d("cccccc", "current is fragment one")
                return@setOnClickListener
            }
            Log.d("cccccc", "button1  ${supportFragmentManager.backStackEntryCount}")
            val fragment: Fragment? = supportFragmentManager.findFragmentByTag("one")
            if (fragment != null) {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.wrapper, fragment, "one")
                transaction.addToBackStack(null)
                transaction.commit()
            } else {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.wrapper, FragmentOne(), "one")
                transaction.addToBackStack(null)
                transaction.commit()

            }
        }
        button3.setOnClickListener {
            val currentFragment = supportFragmentManager.findFragmentById(R.id.wrapper)
            if(currentFragment is FragmentTwo){
                Log.d("cccccc", "current is fragment two")
                return@setOnClickListener
            }
            Log.d("cccccc", "button2  ${supportFragmentManager.backStackEntryCount}")
            val fragment: Fragment? = supportFragmentManager.findFragmentByTag("two")
            if (fragment != null) {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.wrapper, fragment, "two")
                transaction.addToBackStack(null)
                transaction.commit()
            } else {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.wrapper, FragmentTwo(), "two")
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount != 0){
            supportFragmentManager.popBackStack()
        }else{
            super.onBackPressed()
        }
    }
}
