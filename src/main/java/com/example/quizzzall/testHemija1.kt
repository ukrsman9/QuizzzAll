package com.example.quizzzall

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


import androidx.navigation.fragment.findNavController

class testHemija1  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_test_hemija1, container, false   )

        val pitanje = view.findViewById<TextView>(R.id.tv_q)
        val b1 = view.findViewById<Button>(R.id.tv_option1)
        val b2 = view.findViewById<Button>(R.id.tv_option2)
        val b3 = view.findViewById<Button>(R.id.tv_option3)
        val b4 = view.findViewById<Button>(R.id.tv_option4)
        val dugme = view.findViewById<Button>(R.id.dugme)
        val dugmeDouble = view.findViewById<Button>(R.id.dugmeDubble)
        val REZULTATI =view.findViewById<Button>(R.id.REZULTATI)




        val lista = Constants.getQ()
        val question: Question = lista[pozicija ]

        val listaTacnih = tacanodgovor.Todgovor()
        val odgovori : Odgovori = listaTacnih[pozicija1]

        pitanje.text = question.question
        b1.text = question.option1
        b2.text = question.option2
        b3.text = question.option3
        b4.text = question.option4

        b1.isClickable=true
        b2.isClickable=true
        b3.isClickable=true
        b4.isClickable=true

        b1.setOnClickListener{
            if(question.option1.equals(odgovori.TacanOdgovor))
            {  b1.setBackgroundColor(Color.GREEN)
                    rezultat+=1}
            else
            {b1.setBackgroundColor(Color.RED)
               if(question.option2.equals(odgovori.TacanOdgovor))
                   b2.setBackgroundColor(Color.GREEN)
               if(question.option3.equals(odgovori.TacanOdgovor))
                    b3.setBackgroundColor(Color.GREEN)
               if(question.option4.equals(odgovori.TacanOdgovor))
                    b4.setBackgroundColor(Color.GREEN)
            }
            b1.isClickable=false
            b2.isClickable=false
            b3.isClickable=false
            b4.isClickable=false


        }
        b2.setOnClickListener{
            if(question.option2.equals(odgovori.TacanOdgovor))
            {  b2.setBackgroundColor(Color.GREEN)
                rezultat+=1}
            else
            {b2.setBackgroundColor(Color.RED)
                if(question.option1.equals(odgovori.TacanOdgovor))
                    b1.setBackgroundColor(Color.GREEN)
                if(question.option3.equals(odgovori.TacanOdgovor))
                    b3.setBackgroundColor(Color.GREEN)
                if(question.option4.equals(odgovori.TacanOdgovor))
                    b4.setBackgroundColor(Color.GREEN)
            }
            b1.isClickable=false
            b2.isClickable=false
            b3.isClickable=false
            b4.isClickable=false
        }
        b3.setOnClickListener{
            if(question.option3.equals(odgovori.TacanOdgovor))
            {  b3.setBackgroundColor(Color.GREEN)
                rezultat+=1}
            else
            {b3.setBackgroundColor(Color.RED)
                if(question.option2.equals(odgovori.TacanOdgovor))
                    b2.setBackgroundColor(Color.GREEN)
                if(question.option1.equals(odgovori.TacanOdgovor))
                    b1.setBackgroundColor(Color.GREEN)
                if(question.option4.equals(odgovori.TacanOdgovor))
                    b4.setBackgroundColor(Color.GREEN)
            }
            b1.isClickable=false
            b2.isClickable=false
            b3.isClickable=false
            b4.isClickable=false
        }
        b4.setOnClickListener{
            if(question.option4.equals(odgovori.TacanOdgovor))
            {  b4.setBackgroundColor(Color.GREEN)
                rezultat+=1}
            else
            {b4.setBackgroundColor(Color.RED)
                if(question.option2.equals(odgovori.TacanOdgovor))
                b2.setBackgroundColor(Color.GREEN)
                if(question.option3.equals(odgovori.TacanOdgovor))
                    b3.setBackgroundColor(Color.GREEN)
                if(question.option1.equals(odgovori.TacanOdgovor))
                    b1.setBackgroundColor(Color.GREEN)
            }
            b1.isClickable=false
            b2.isClickable=false
            b3.isClickable=false
            b4.isClickable=false
        }
        pozicija+=1
        pozicija1+=1

        dugme.setOnClickListener{
            findNavController().navigate(R.id.action_testHemija1_self)

        }

        REZULTATI.setOnClickListener {
            Toast.makeText(getActivity(), "broj poena $rezultat ", Toast.LENGTH_LONG).show()
        }

        if(pozicija1==5) {
            dugmeDouble.isClickable = true
            dugmeDouble.visibility = View.VISIBLE
            dugmeDouble.setOnClickListener {

                findNavController().navigate(R.id.REZULTATI)
            }
        }




        return view  }}

