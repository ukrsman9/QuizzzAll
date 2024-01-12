package com.example.quizzzall

import android.graphics.Color
import android.graphics.ColorMatrix
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.res.ComplexColorCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController



class hemija : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {




        val view = inflater.inflate(R.layout.fragment_hemija, container, false)
        val button =view.findViewById<Button>(R.id.uciHemiju)

        button.setOnClickListener{
            findNavController().navigate(R.id.uciHemija)
        }

        val button2 = view.findViewById<Button>(R.id.igrajHemiju)
        button2.setOnClickListener{
            findNavController().navigate(R.id.testHemija)
        }

        val button3 = view.findViewById<Button>(R.id.toEng)
        button3.setOnClickListener{
            findNavController().navigate(R.id.engleski)
        }

        return view
    }

}