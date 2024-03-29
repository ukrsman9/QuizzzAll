package com.example.quizzzall

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.awaitAll

class testEngleski1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_test_engleski1, container, false)

        val tX1 = view.findViewById<TextView>(R.id.tvqETC)
        val tX2 = view.findViewById<TextView>(R.id.tvqETR)

        val fC1 = view.findViewById<CheckBox>(R.id.odgovor1CB)
        val fC2 = view.findViewById<CheckBox>(R.id.odgovor2CB)
        val fC3 = view.findViewById<CheckBox>(R.id.odgovor3CB)
        val fC4 = view.findViewById<CheckBox>(R.id.odgovor4CB)

        val fB1 = view.findViewById<Button>(R.id.odgovor1RB)
        val fB2 = view.findViewById<Button>(R.id.odgovor2RB)
        val fB3 = view.findViewById<Button>(R.id.odgovor3RB)
        val fB4 = view.findViewById<Button>(R.id.odgovor4RB)

        val dalje=view.findViewById<Button>(R.id.dalje)
        val dugmeDouble1 = view.findViewById<Button>(R.id.dugmeDubble1)

        if(false)
        {
         fB1.visibility = View.GONE
         fB2.visibility = View.GONE
         fB3.visibility = View.GONE
         fB4.visibility = View.GONE
         tX1.visibility = View.GONE

         fC1.visibility=View.VISIBLE
         fC2.visibility=View.VISIBLE
         fC3.visibility=View.VISIBLE
         fC4.visibility=View.VISIBLE
            tX2.visibility=View.VISIBLE


            val ListaPitanjaC = boks.boks()
            val LP: ConstantsEngleskiCB = ListaPitanjaC[ pozicijaEC ]

            val listaTacnihC = boksT.boksT()
            val LT: OdgovoriCB = listaTacnihC[pozicijaEC]

            tX1.text = LP.pitanje
            fC1.text = LP.optionE1
            fC2.text = LP.optionE2
            fC3.text = LP.optionE3
            fC4.text = LP.optionE4


            if (fC1.isChecked){
                gaser +=1
                if(LP.optionE1.equals(LT.odgovor1) ||  LP.optionE1.equals(LT.odgovor2))
                {
                    gaser +=1
                }}

            if (fC2.isChecked){
                if(LP.optionE2.equals(LT.odgovor1) ||  LP.optionE2.equals(LT.odgovor2))
                {
                    gaser +=1

                }}


            if (fC3.isChecked){
                if (LP.optionE3.equals(LT.odgovor1) || LP.optionE3.equals(LT.odgovor2)) {
                    gaser += 1

                }}

            if (fC4.isChecked) {
                    if (LP.optionE4.equals(LT.odgovor1) || LP.optionE4.equals(LT.odgovor2)) {
                        gaser += 1
                    }
                }

            pozicijaEC+=1
        }
    else
        {

            val listaPitanjaB = pitanjaEngleski.epitanja()
            val ER: ConstantsEngleski = listaPitanjaB[pozicijaER]

            val listaOdgovoraB = tacanodgovorE.TodgovorE()
            val ERT: Odgovori= listaOdgovoraB[pozicijaER]


            fB1.visibility = View.VISIBLE
            fB2.visibility = View.VISIBLE
            fB3.visibility = View.VISIBLE
            fB4.visibility = View.VISIBLE

            fC1.visibility=View.GONE
            fC2.visibility=View.GONE
            fC3.visibility=View.GONE
            fC4.visibility=View.GONE

            tX2.text = ER.questionE
            fB1.text = ER.optionE1
            fB2.text = ER.optionE2
            fB3.text = ER.optionE3
            fB4.text = ER.optionE4


            fB1.setOnClickListener{
                if(ER.optionE1.equals(ERT.TacanOdgovor))
                {  fB1.setBackgroundColor(Color.GREEN)
                    rezultat+=1}
                else
                {fB1.setBackgroundColor(Color.RED)
                    if(ER.optionE2.equals(ERT.TacanOdgovor))
                        fB2.setBackgroundColor(Color.GREEN)
                    if(ER.optionE3.equals(ERT.TacanOdgovor))
                        fB3.setBackgroundColor(Color.GREEN)
                    if(ER.optionE4.equals(ERT.TacanOdgovor))
                        fB4.setBackgroundColor(Color.GREEN)
                }
                fB1.isClickable=false
                fB2.isClickable=false
                fB3.isClickable=false
                fB4.isClickable=false

            }
            fB2.setOnClickListener{
                if(ER.optionE2.equals(ERT.TacanOdgovor))
                {  fB2.setBackgroundColor(Color.GREEN)
                    rezultat+=1}
                else
                {fB2.setBackgroundColor(Color.RED)
                    if(ER.optionE1.equals(ERT.TacanOdgovor))
                        fB1.setBackgroundColor(Color.GREEN)
                    if(ER.optionE3.equals(ERT.TacanOdgovor))
                        fB3.setBackgroundColor(Color.GREEN)
                    if(ER.optionE4.equals(ERT.TacanOdgovor))
                        fB4.setBackgroundColor(Color.GREEN)
                }
                fB1.isClickable=false
                fB2.isClickable=false
                fB3.isClickable=false
                fB4.isClickable=false
            }
            fB3.setOnClickListener{
                if(ER.optionE3.equals(ERT.TacanOdgovor))
                {  fB3.setBackgroundColor(Color.GREEN)
                    rezultat+=1}
                else
                {fB3.setBackgroundColor(Color.RED)
                    if(ER.optionE2.equals(ERT.TacanOdgovor))
                        fB2.setBackgroundColor(Color.GREEN)
                    if(ER.optionE1.equals(ERT.TacanOdgovor))
                        fB1.setBackgroundColor(Color.GREEN)
                    if(ER.optionE4.equals(ERT.TacanOdgovor))
                        fB4.setBackgroundColor(Color.GREEN)
                }
                fB1.isClickable=false
                fB2.isClickable=false
                fB3.isClickable=false
                fB4.isClickable=false
            }
            fB4.setOnClickListener{
                if(ER.optionE4.equals(ERT.TacanOdgovor))
                {  fB4.setBackgroundColor(Color.GREEN)
                    rezultat+=1}
                else
                {fB4.setBackgroundColor(Color.RED)
                    if(ER.optionE2.equals(ERT.TacanOdgovor))
                        fB2.setBackgroundColor(Color.GREEN)
                    if(ER.optionE3.equals(ERT.TacanOdgovor))
                        fB3.setBackgroundColor(Color.GREEN)
                    if(ER.optionE1.equals(ERT.TacanOdgovor))
                        fB1.setBackgroundColor(Color.GREEN)
                }
                fB1.isClickable=false
                fB2.isClickable=false
                fB3.isClickable=false
                fB4.isClickable=false
            }
            pozicijaER+=1

        }

        fantazija+=1

        dugmeDouble1.setOnClickListener{
            // findNavController().navigate(R.id.REZULTATI)
            //tX2.text="$rezultat"
            Toast.makeText(activity,"Broj poena : $rezultat",Toast.LENGTH_SHORT).show()

        }

        dalje.setOnClickListener{

            if (fantazija-2>4)
            {
                findNavController().navigate(R.id.action_testEngleski1_to_REZULTATI)

            }
            else{findNavController().navigate(R.id.action_testEngleski1_self)

            }



        }

        return view
    }}
