package com.example.loup.charaters

import android.util.Log

class Thieve(override var name: String = "Voleur",
               override var description: String = "Echange sa carte avec un autre et découvre sa nouvelle carte.",
               override var team: String = "Villageois"
) : Character() {
    override fun action() {
        Log.d("_______Action","Villageois")
    }
}