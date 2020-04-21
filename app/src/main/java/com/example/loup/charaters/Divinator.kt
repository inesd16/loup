package com.example.loup.charaters

import android.util.Log

class Divinator(override var name: String = "Divinateur",
                override var description: String = "Découvre la carte d'un autre joueur. Si c'est un villageois la carte reste découverte.",
                override var team: String = "Villageois"
) : Character() {
    override fun action() {
        Log.d("_______Action",name)
    }
}