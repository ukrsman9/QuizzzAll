package com.example.quizzzall

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class testiranjeBaze : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
         val view = inflater.inflate(R.layout.fragment_testiranje_baze, container, false)

        val pitanje = view.findViewById<TextView>(R.id.BazaPitanje1)
        val b1 = view.findViewById<Button>(R.id.BazaOdgovorB1)
        val b2 = view.findViewById<Button>(R.id.BazaOdgovorB2)
        val u1 = view.findViewById<EditText>(R.id.ubaci)

        val dugme = view.findViewById<Button>(R.id.BazaDalje)
        val dugmeDouble = view.findViewById<Button>(R.id.BazadugmeDubble1)


        val odg1 = u1.text.toString()


        dugme.setOnClickListener {
            saveFireStore(odg1, pitanje as TextView)

        }

        return view}}

    fun saveFireStore(u1: String  , pitanje : TextView)
    {

        val db = Firebase.firestore
        val user: MutableMap<String , Any > = HashMap()

        user["ime"]= u1

        db.collection("engleski1")
            .add(user)
        readFireStoreData(pitanje)
    }

fun readFireStoreData(pitanje: TextView)
{
    val db = Firebase.firestore
   /* db.collection("engleski1")
        .get()
        .addOnCompleteListener {
            val rezult : StringBuffer = StringBuffer()
            if (it.isSuccessful)
                for(document in it.result!!)
                {
                    rezult.append(document.data.getValue("1")).append(" ")

                }*/
    db.collection("engleski1")
        .get()
        .addOnSuccessListener { result ->
            for (document in result) {

                Log.d(TAG, "${document.id} => ${document.data}")
            }
        }


}


