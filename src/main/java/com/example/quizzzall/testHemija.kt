package com.example.quizzzall

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class testHemija : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        pozicija = 0

        val view = inflater.inflate(R.layout.fragment_test_hemija, container, false)


        val button =view.findViewById<Button>(R.id.kuci2)
        button.setOnClickListener{
            findNavController().navigate(R.id.hemija)
        }

        val button1 =view.findViewById<Button>(R.id.test1)
        button1.setOnClickListener{
            findNavController().navigate(R.id.testHemija1)
        }

        val button2 =view.findViewById<Button>(R.id.test2)
        button2.setOnClickListener{

        }


        val button3 =view.findViewById<Button>(R.id.test3)
        button3.setOnClickListener{

        }


        return view
    }
    }

