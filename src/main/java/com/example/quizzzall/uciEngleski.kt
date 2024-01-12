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


class uciEngleski : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_uci_engleski, container, false)


        val back = view.findViewById<ImageView>(R.id.kuci3)
        back.setOnClickListener {
            findNavController().navigate(R.id.engleski)
        }

        val uci1 = view.findViewById<Button>(R.id.UCI1)
        uci1.setOnClickListener {
            findNavController().navigate(R.id.action_uciEngleski2_to_uciEngleski1)
        }

        val uci2 = view.findViewById<ImageView>(R.id.UCI2)
        uci2.setOnClickListener {
            Toast.makeText(activity,"u pripremi ", Toast.LENGTH_SHORT).show()
        }

        return view
    }

}


