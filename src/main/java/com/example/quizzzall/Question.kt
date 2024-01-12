package com.example.quizzzall

data class Question(
    val id: Int,
    val question: String,
    val option1:String,
    val option2:String,
    val option3:String,
    val option4:String,
    val corectA:Int,

)

data class Odgovori(
    val TacanOdgovor:String,
)

data class ConstantsEngleski (
    var id: Int ,
    val questionE: String,
    val optionE1:String,
    val optionE2:String,
    val optionE3:String,
    val optionE4:String
        )
data class  ConstantsEngleskiCB(
    var id:Int,
    val pitanje: String,
    val optionE1: String,
    val optionE2: String,
    val optionE3: String,
    val optionE4: String,
)

data class  OdgovoriCB(
    val odgovor1 :String,
    val odgovor2 :String,
    var id: Int
)


