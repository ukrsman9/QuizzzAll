package com.example.quizzzall

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class testHemija1_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        var view = inflater.inflate(R.layout.fragment_test_hemija1_1, container, false)

        val pitanje = view.findViewById<TextView>(R.id.pitanjeCB)
        val b1 = view.findViewById<Button>(R.id.cbh_1)
        val b2 = view.findViewById<Button>(R.id.cbh_2)
        val b3 = view.findViewById<Button>(R.id.cbh_3)
        val b4 = view.findViewById<Button>(R.id.cbh_4)
        val dugme = view.findViewById<Button>(R.id.daljeCB)


        val listaCB = CbConstants.getQCB()

        val question: QuestionCB = listaCB[pozicija - 1]

        pitanje.text = question.questionCB
        b1.text = question.option1CB
        b2.text = question.option2CB
        b3.text = question.option3CB
        b4.text = question.option4CB
        pozicija+=1

        dugme.setOnClickListener{
            // findNavController().navigate(R.id.hemija)
        }

        return view
    }}
