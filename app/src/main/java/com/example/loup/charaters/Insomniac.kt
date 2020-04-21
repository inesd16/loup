package com.example.loup.charaters

import android.util.Log

class Insomniac(override var name: String = "Insomniaque",
                override var description: String = "Regarde sa carte avant le lever du jour",
                override var team: String = "Villageois"
) : Character() {
    override fun action() {
        Log.d("_______Action",name)
    }
}