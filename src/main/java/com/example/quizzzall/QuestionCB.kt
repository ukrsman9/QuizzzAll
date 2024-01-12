package com.example.quizzzall

data class QuestionCB(
    val id: Int,
    val questionCB: String,
    val option1CB:String,
    val option2CB:String,
    val option3CB:String,
    val option4CB:String,
    val corectACB:Int,
)

data class Odgovor(
    val a:Int
        )