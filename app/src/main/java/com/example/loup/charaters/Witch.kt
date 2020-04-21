package com.example.loup.charaters

import android.util.Log

class Witch(override var name: String = "La Sorcière",
            override var description: String = "Peux prendre une carte au milieu et la regarder. Si elle le fait, elle doit remplacer la carte d'un autre joueur par celle-ci.",
            override var team: String = "Villageois"
) : Character() {
    override fun action() {
        Log.d("_______Action",name)
    }
}