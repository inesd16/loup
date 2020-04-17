package com.example.loup.charaters

abstract class Character {
    abstract var name : String
    abstract var description : String
    abstract var team : String

    abstract fun action()
}