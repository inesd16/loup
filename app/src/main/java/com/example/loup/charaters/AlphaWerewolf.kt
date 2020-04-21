package com.example.loup.charaters

import android.util.Log

class AlphaWerewolf(override var name: String = "Loup Alpha",
                    override var description: String = "Transformer un personnage en loup garou",
                    override var team: String = "Loup"
) : Character() {
    override fun action() {
        Log.d("_______Action",name)
    }
}