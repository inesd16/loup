package com.example.loup

import android.util.Log

class Werewolf(override var name: String = "Werewolf",
               override var description: String = "Description du loup") : Character() {
    override fun action() {
        Log.d("_______TEST","Loup")
    }
}