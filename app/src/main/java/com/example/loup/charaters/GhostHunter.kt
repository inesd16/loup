package com.example.loup.charaters

import android.util.Log

class GhostHunter (override var name: String = "Chasseur de fantômes",
                   override var description: String = "Peut regarder jusqu'à deux cartes. S'il trouve un tanneur, loup ou vampire il n'a plus le droit de regarder d'autre carte et devient tanneur, loup-garou ou vampire.",
                   override var team: String = "Villageois/Peut changer"
) : Character() {
    override fun action() {
        Log.d("_______Action","Chasseur de fantômes")
    }
}