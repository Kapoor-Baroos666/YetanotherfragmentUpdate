package com.example.yetanotherfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Busana = findViewById<Button>(R.id.Busana)
        val Kuliner = findViewById<Button>(R.id.Kuliner)
        val Pplg = findViewById<Button>(R.id.Pplg)
        val To = findViewById<Button>(R.id.To)
        val Tpfl = findViewById<Button>(R.id.Tpfl)

        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, BusanaFragment())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, KulinerFragment())
            fragmentTransaction.commit()
        }

        Pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, PplgFragment())
            fragmentTransaction.commit()
        }

        To.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, ToFragment())
            fragmentTransaction.commit()
        }

        Tpfl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, TpflFragment())
            fragmentTransaction.commit()
        }

    }
}