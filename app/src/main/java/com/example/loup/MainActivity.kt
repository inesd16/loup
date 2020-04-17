package com.example.loup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_dynamic = Button(this)
        val button_dynamic1 = Button(this)
        val button_dynamic2 = Button(this)
        val button_dynamic3 = Button(this)
        val button_dynamic4 = Button(this)
        val button_dynamic5 = Button(this)
        grillePerso.addView(button_dynamic)
        grillePerso.addView(button_dynamic1)
        grillePerso.addView(button_dynamic2)
        grillePerso.addView(button_dynamic3)
        grillePerso.addView(button_dynamic4)
        grillePerso.addView(button_dynamic5)
    }
}
