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

class testEngleski : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
         val view = inflater.inflate(R.layout.fragment_test_engleski, container, false)

        pozicija = 1
         pozicija1 = 0

         rezultat=0
        gaser  =0
        fantazija=2

          pozicijaEC=0
          pozicijaER=0

        val back =view.findViewById<ImageView>(R.id.kuci2)
        back.setOnClickListener{
            findNavController().navigate(R.id.engleski)
        }

        val test1 =view.findViewById<ImageView>(R.id.testE1)
        test1.setOnClickListener{
            findNavController().navigate(R.id.testEngleski1)
        }

        val test2 =view.findViewById<ImageView>(R.id.testE2)
        test2.setOnClickListener{
            findNavController().navigate(R.id.testEngleski2)
        }

        val test3 =view.findViewById<ImageView>(R.id.testE3)
        test3.setOnClickListener{
            Toast.makeText(activity,"u pripremi ", Toast.LENGTH_SHORT).show()
        }

        val test4 =view.findViewById<ImageView>(R.id.testE4)
        test4.setOnClickListener{
            Toast.makeText(activity,"u pripremi ", Toast.LENGTH_SHORT).show()
        }

        val test5 =view.findViewById<ImageView>(R.id.testE5)
        test5.setOnClickListener{
            Toast.makeText(activity,"u pripremi ", Toast.LENGTH_SHORT).show()
        }

        val test6 =view.findViewById<ImageView>(R.id.testE6)
        test6.setOnClickListener{
            Toast.makeText(activity,"u pripremi ", Toast.LENGTH_SHORT).show()
        }

        val test7 =view.findViewById<ImageView>(R.id.testE7)
        test7.setOnClickListener{
            Toast.makeText(activity,"u pripremi ", Toast.LENGTH_SHORT).show()
        }
        val test8 =view.findViewById<ImageView>(R.id.testE8)
        test8.setOnClickListener{
            Toast.makeText(activity,"u pripremi ", Toast.LENGTH_SHORT).show()
        }
        val test9 =view.findViewById<ImageView>(R.id.testE9)
        test9.setOnClickListener{
            Toast.makeText(activity,"u pripremi ", Toast.LENGTH_SHORT).show()
        }



        return view
    }}

