package com.example.loup.charaters

import android.util.Log

class Clairvoyant(
    override var name: String = "Voyante",
    override var description: String = "Regarder la carte d'un autre joueur ou regarder deux cartes au centre",
    override var team: String = "Villageoise"
) : Character() {
    override fun action() {
        Log.d("_______Action","Voyante")
    }
}