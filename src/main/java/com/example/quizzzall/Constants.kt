package com.example.quizzzall

object Constants {
    fun getQ():ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(1, "sat bre 1",
            "pitanje1",
            "pitanje2",
            "pitanje3",
            "pitanje4",
            1
        )
        questionList.add(que1)
        val que2 = Question(2, "sat bre 2",
            "pitanje1",
            "pitanje2",
            "pitanje3",
            "pitanje4",
            1
        )
        questionList.add(que2)
        val que3 = Question(3, "sat bre 3",
            "pitanje1",
            "pitanje2",
            "pitanje3",
            "pitanje4",
            1
        )
        questionList.add(que3)
        val que4 = Question(4, "sat bre 4",
            "orvui2",
            "tokio2",
            "zelja2",
            "molem2",
            1
        )
        questionList.add(que4)
        val que5 = Question(5, "sat bre 5",
            "orvui2",
            "tokio2",
            "zelja2",
            "molem2",
            1
        )
        questionList.add(que5)
        return questionList
    }}

object tacanodgovor{
    fun Todgovor():ArrayList<Odgovori>
    {
        val listaOdgovora =ArrayList<Odgovori>()
        val odgovor1 = Odgovori("pitanje1")
        listaOdgovora.add(odgovor1)

        val odgovor2 = Odgovori("pitanje2")
        listaOdgovora.add(odgovor2)

        val odgovor3 = Odgovori("tokio")
        listaOdgovora.add(odgovor3)


        val odgovor4 = Odgovori("tokio")
        listaOdgovora.add(odgovor4)

        val odgovor5 = Odgovori("tokio2")
        listaOdgovora.add(odgovor5)

   return listaOdgovora
    } }

//ENGLESKI  TEST 1-----------------------------------------------------------------------------------------------------------------------------------------------------

object pitanjaEngleski{
    fun epitanja(): ArrayList<ConstantsEngleski>
    {
        val listaPitanja =ArrayList<ConstantsEngleski>()

        val q1 = ConstantsEngleski(1," Choose the question for this answer: - He's nice and polite.",
            "What does he look like?",     //" What does he look like?",
            "What is he like?",
            "How is he?",
            "None of the above"
        )
        listaPitanja.add(q1)
        val qe2 = ConstantsEngleski(2,"Choose the question for this answer: - He's quite handsome and tall.",
            "What does he look like?",
            "Who does he look like?",
            "What is he like?",
            "None of the above",

        )
        listaPitanja.add(qe2)
        val qu3 = ConstantsEngleski(3,"Choose the question for this answer: - It's short and blonde",
            "What does she look like?",
            "What is she like?",
            "What does her hair look like?",
            "None of the above",

        )
        listaPitanja.add(qu3)
        val qu4 = ConstantsEngleski(4,"Choose the correct answer:- Can you help me ______ my glasses?",
            "pay back",
            "look for",
            "look at",
            "None of the above",

        )
        listaPitanja.add(qu4)
        val qu5 = ConstantsEngleski(5,
            " Choose the correct answer: - Please ______ the litter form the floor.",
            "pick up",
            "turn off",
            "put on",
            "None of the above",

        )
        listaPitanja.add(qu5)

        val qu6 = ConstantsEngleski(6,
            "Choose the correct answer: - I'm tired, I'm going to _______.",
            "throw away",
            "lie down",
            "look after",
            "None of the above",

            )
        listaPitanja.add(qu6)




        return listaPitanja
    }}
object tacanodgovorE{
        fun TodgovorE():ArrayList<Odgovori>
        {
            val listaOdgovoraa =ArrayList<Odgovori>()
            val odgovorE1 = Odgovori("What is he like?")

            listaOdgovoraa.add(odgovorE1)

            val odgovor2 = Odgovori("What does he look like?")
            listaOdgovoraa.add(odgovor2)

            val odgovor3 = Odgovori("What does her hair look like?")
            listaOdgovoraa.add(odgovor3)


            val odgovor4 = Odgovori("look for")
            listaOdgovoraa.add(odgovor4)

            val odgovor5 = Odgovori("pick up")
            listaOdgovoraa.add(odgovor5)

            val odgovor6 = Odgovori("lie down")
            listaOdgovoraa.add(odgovor6)

            return listaOdgovoraa
        } }


object boks{
    fun boks():ArrayList<ConstantsEngleskiCB>
    {
        val listaPitanja = ArrayList<ConstantsEngleskiCB>()

        val odgovorE1 = ConstantsEngleskiCB(1,"aa","a","b","c","d")
            listaPitanja.add(odgovorE1)
        val odgovorE2 = ConstantsEngleskiCB(2,"","","","","")
            listaPitanja.add(odgovorE2)
        val odgovorE3 = ConstantsEngleskiCB(3,"","","","","")
            listaPitanja.add(odgovorE3)
        val odgovorE4 = ConstantsEngleskiCB(4,"","","","","")
            listaPitanja.add(odgovorE4)
        val odgovorE5 = ConstantsEngleskiCB(5,"","","","","")
        listaPitanja.add(odgovorE5)


        return listaPitanja
}}

object boksT{
    fun boksT():ArrayList<OdgovoriCB>
    {
        val listaOdgovoraa = ArrayList<OdgovoriCB>()


        val odgovorE1 = OdgovoriCB("a","b",1)
        listaOdgovoraa.add(odgovorE1)
        val odgovorE2 = OdgovoriCB("a","b",2)
        listaOdgovoraa.add(odgovorE2)
        val odgovorE3 = OdgovoriCB("","",3)
        listaOdgovoraa.add(odgovorE3)
        val odgovorE4 = OdgovoriCB("","",4)
        listaOdgovoraa.add(odgovorE4)


        return listaOdgovoraa
    }
}


//ENGLESKI  TEST 2------------------------------------------------------------------------------------------------------------------------------

object pitanjaEngleski2{
    fun epitanja(): ArrayList<ConstantsEngleski>
    {
        val listaPitanja =ArrayList<ConstantsEngleski>()

        val q1 = ConstantsEngleski(1,"Choose the correct option:  Mia is ______ than John.  ",
            "busier",
            "busyer",
            "the busiest",
            "None of the above"
        )
        listaPitanja.add(q1)
        val qe2 = ConstantsEngleski(2,"Choose the correct option: \n" +
                "A cheetah can run _____ a zebra.  ",
            "more fast than",
            "much faster than",
            "fastest",
            "None of the above",

            )
        listaPitanja.add(qe2)
        val qu3 = ConstantsEngleski(3,"Choose the correct option: \n" +
                                             "Dubai isn't as ______ as this town.    ",
            "dryer",
            "drier",
            "dry",
            "None of the above",

            )
        listaPitanja.add(qu3)
        val qu4 = ConstantsEngleski(4,"Choose the correct option: \n" +
                                                "That was _____ day of the year.   ",
            "hotter",
            "hottest",
            "the hottest",
            "None of the above",

            )
        listaPitanja.add(qu4)
        val qu5 = ConstantsEngleski(5,
            "Choose the correct option: \n" +
                    "Marcel is __________ student in his class.  ",
            "more ambitious",
            "the most ambitious",
            "as ambitious as",
            "None of the above",

            )
        listaPitanja.add(qu5)


        return listaPitanja
    }}
object tacanodgovorE2{
    fun TodgovorE():ArrayList<Odgovori>
    {
        val listaOdgovoraa =ArrayList<Odgovori>()
        val odgovorE1 = Odgovori("busier")

        listaOdgovoraa.add(odgovorE1)

        val odgovor2 = Odgovori("much faster than")
        listaOdgovoraa.add(odgovor2)

        val odgovor3 = Odgovori("dry")
        listaOdgovoraa.add(odgovor3)


        val odgovor4 = Odgovori("the hottest")
        listaOdgovoraa.add(odgovor4)

        val odgovor5 = Odgovori("the most ambitious")
        listaOdgovoraa.add(odgovor5)

        return listaOdgovoraa
    } }



object boks2{
    fun boks():ArrayList<ConstantsEngleskiCB>
    {
        val listaPitanja = ArrayList<ConstantsEngleskiCB>()

        val odgovorE1 = ConstantsEngleskiCB(1,"aa2","a2","b2","c2","d2")
        listaPitanja.add(odgovorE1)
        val odgovorE2 = ConstantsEngleskiCB(2,"","","","","")
        listaPitanja.add(odgovorE2)
        val odgovorE3 = ConstantsEngleskiCB(3,"","","","","")
        listaPitanja.add(odgovorE3)
        val odgovorE4 = ConstantsEngleskiCB(4,"","","","","")
        listaPitanja.add(odgovorE4)
        val odgovorE5 = ConstantsEngleskiCB(5,"","","","","")
        listaPitanja.add(odgovorE5)


        return listaPitanja
    }}

object boksT2{
    fun boksT():ArrayList<OdgovoriCB>
    {
        val listaOdgovoraa = ArrayList<OdgovoriCB>()


        val odgovorE1 = OdgovoriCB("a2","b2",1)
        listaOdgovoraa.add(odgovorE1)
        val odgovorE2 = OdgovoriCB("a","b",2)
        listaOdgovoraa.add(odgovorE2)
        val odgovorE3 = OdgovoriCB("","",3)
        listaOdgovoraa.add(odgovorE3)
        val odgovorE4 = OdgovoriCB("","",4)
        listaOdgovoraa.add(odgovorE4)


        return listaOdgovoraa
    }
}




