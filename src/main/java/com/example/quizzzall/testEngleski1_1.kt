package com.example.quizzzall

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.navigation.fragment.findNavController


class testEngleski1_1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_test_engleski, container, false)

        val dugme=view.findViewById<Button>(R.id.daljeCB)

        val cb1 =view.findViewById<CheckBox>(R.id.cb_1)
        val cb2 =view.findViewById<CheckBox>(R.id.cb_2)
        val cb3 =view.findViewById<CheckBox>(R.id.cb_3)
        val cb4 =view.findViewById<CheckBox>(R.id.cb_4)

        dugme.setOnClickListener()
        {
            if(cb1.isChecked)
            {

            }
            if(cb2.isChecked)
            {

            }
            if(cb3.isChecked)
            {

            }
            if(cb4.isChecked)
            {

            }
        }

        return view

    } }