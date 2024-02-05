package com.example.yetanotherfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Busana = findViewById<Button>(R.id.Busana)
        val Kuliner = findViewById<Button>(R.id.Kuliner)
        val Pplg = findViewById<Button>(R.id.Pplg)
        val To = findViewById<Button>(R.id.To)
        val Tpfl = findViewById<Button>(R.id.Tpfl)

        Toast.makeText(this, "App is running", Toast.LENGTH_SHORT).show()

        Busana.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Important")
                .setMessage("Coblos 02 all in")
                .setPositiveButton("Yes",{ dialogInterface, i -> Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show() })
                .setNegativeButton("No",{ dialogInterface, i -> Toast.makeText(this, "Fragment not running", Toast.LENGTH_SHORT).show() })

            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, BusanaFragment())
            fragmentTransaction.commit()

//            Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show()
        }

        Kuliner.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Important")
                .setMessage("Coblos 02 all in")
                .setPositiveButton("Yes",{ dialogInterface, i -> Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show() })
                .setNegativeButton("No",{ dialogInterface, i -> Toast.makeText(this, "Fragment not running", Toast.LENGTH_SHORT).show() })

            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, KulinerFragment())
            fragmentTransaction.commit()


//            Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show()
        }

        Pplg.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Important")
                .setMessage("Coblos 02 all in")
                .setPositiveButton("Yes",{ dialogInterface, i -> Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show() })
                .setNegativeButton("No",{ dialogInterface, i -> Toast.makeText(this, "Fragment not running", Toast.LENGTH_SHORT).show() })

            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, PplgFragment())
            fragmentTransaction.commit()


//            Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show()
        }

        To.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Important")
                .setMessage("Coblos 02 all in")
                .setPositiveButton("Yes",{ dialogInterface, i -> Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show() })
                .setNegativeButton("No",{ dialogInterface, i -> Toast.makeText(this, "Fragment not running", Toast.LENGTH_SHORT).show() })


            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, ToFragment())
            fragmentTransaction.commit()

//            Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show()
        }

        Tpfl.setOnClickListener {

            AlertDialog.Builder(this)
                .setTitle("Important")
                .setMessage("Coblos 02 all in")
                .setPositiveButton("Yes",{ dialogInterface, i -> Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show() })
                .setNegativeButton("No",{ dialogInterface, i -> Toast.makeText(this, "Fragment not running", Toast.LENGTH_SHORT).show() })


            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, TpflFragment())
            fragmentTransaction.commit()

//            Toast.makeText(this, "Fragment is running", Toast.LENGTH_SHORT).show()
        }

    }
}