package com.example.quizzzall

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.firebase.firestore.FirebaseFirestore


var  pozicija = 1
var  pozicija1 = 0

var  rezultat=0
var  gaser  =0
var  fantazija=2

var  pozicijaEC=0
var  pozicijaER=0



class MainActivity : AppCompatActivity()  {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.hemija) as NavHostFragment
        navController = navHostFragment.navController




    }
}