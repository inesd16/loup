package com.example.loup.charaters

import android.util.Log
import com.example.loup.charaters.Character

class Werewolf(override var name: String = "Werewolf",
               override var description: String = "Description du loup") : Character() {
    override fun action() {
        Log.d("_______TEST","Loup")
    }
}