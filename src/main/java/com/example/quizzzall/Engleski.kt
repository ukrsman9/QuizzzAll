package com.example.quizzzall

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlin.system.exitProcess


class Engleski : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_engleski, container, false)

        val button =view.findViewById<ImageView>(R.id.uciEngleski1)
        button.setOnClickListener{
            findNavController().navigate(R.id.uciEngleski2)
        }

        val button2 = view.findViewById<ImageView>(R.id.igrajEngleski)
        button2.setOnClickListener{
            findNavController().navigate(R.id.testEngleski)
        }

        val button3 = view.findViewById<ImageView>(R.id.toHemija)
        button3.setOnClickListener{
            Toast.makeText(activity,"in preparation",Toast.LENGTH_SHORT).show()

        }

        val exit = view.findViewById<ImageView>(R.id.exit)
        exit.setOnClickListener{
               System.exit(0)
           }






        return view

    }


}
