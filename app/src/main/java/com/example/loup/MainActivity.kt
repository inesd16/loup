package com.example.loup

import android.graphics.Point
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Récuperer taille d'écran
        val display = windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)
        val screenWidth: Int = size.x


        val button_dynamic = Button(this)
        button_dynamic.width = screenWidth/4
        button_dynamic.height = screenWidth/4
        val button_dynamic1 = Button(this)
        button_dynamic1.width = screenWidth/4
        button_dynamic1.height = screenWidth/4
        val button_dynamic2 = Button(this)
        button_dynamic2.width = screenWidth/4
        button_dynamic2.height = screenWidth/4
        val button_dynamic3 = Button(this)
        button_dynamic3.width = screenWidth/4
        button_dynamic3.height = screenWidth/4
        val button_dynamic4 = Button(this)
        button_dynamic4.width = screenWidth/4
        button_dynamic4.height = screenWidth/4
        val button_dynamic5 = Button(this)
        button_dynamic5.width = screenWidth/4
        button_dynamic5.height = screenWidth/4
        grillePerso.addView(button_dynamic)
        grillePerso.addView(button_dynamic1)
        grillePerso.addView(button_dynamic2)
        grillePerso.addView(button_dynamic3)
        grillePerso.addView(button_dynamic4)
        grillePerso.addView(button_dynamic5)
    }
    
}
