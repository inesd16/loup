package com.example.loup.charaters

import android.util.Log

class TheThing(override var name: String = "La Chose",
               override var description: String = "Touche l'épaule de son voisn de gauche ou de droite",
               override var team: String = "Villageois"
) : Character() {
    override fun action() {
        Log.d("_______Action",name)
    }
}