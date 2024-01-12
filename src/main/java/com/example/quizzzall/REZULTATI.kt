package com.example.quizzzall


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController


class REZULTATI : Fragment()  {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_r_e_z_u_l_t_a_t_i, container, false)
        val rezNaz = view.findViewById<Button>(R.id.rezNaz)

        val tX1 = view.findViewById<TextView>(R.id.rezultati_1)
        tX1.text= "number of points : $rezultat"

        rezNaz.setOnClickListener{
            findNavController().navigate(R.id.action_REZULTATI_to_engleski)

        }

        return view
    }
}

