package com.example.loup.charaters

import android.util.Log

class ShamanWolf(
    override var name: String = "Loup Shaman",
    override var description: String = "Regarder la carte d'un autre joueur",
    override var team: String = "Loup"
) : Character() {
    override fun action() {
        Log.d("_______Action","Loup shaman")
    }
}