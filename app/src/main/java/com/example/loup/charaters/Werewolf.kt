package com.example.loup.charaters

import android.util.Log
import com.example.loup.charaters.Character

class Werewolf(override var name: String = "Werewolf",
               override var description: String = "Manger des moutons",
               override var team: String = "Loup"
) : Character() {
    override fun action() {
        Log.d("_______Action","Loup")
    }
}