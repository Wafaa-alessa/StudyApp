package com.example.studyapp

import android.app.Activity
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val items = arrayListOf(
            arrayListOf("var and val", "declaring variables and values also the different between.", "Detailed notes here."),
            arrayListOf("User Input", "Get input from the user.", "Detailed notes here."),
            arrayListOf("Strings", "String concatenations, interpolation, and methods.", "Detailed notes here."),
            arrayListOf("Data Types", "Understanding data types.", "Detailed notes here."),
            arrayListOf("Basic Operations", "Performing math operations in Kotlin.", "Detailed notes here."),
            arrayListOf("If Statements", "Understanding when and how to use if, else if, and else statements.", "Detailed notes here."),
            arrayListOf("Error Handling", "Using try blocks to avoid runtime errors.", "Detailed notes here."),
            arrayListOf("For Loops", "Using for loops to automate code.", "Detailed notes here."),
            arrayListOf("While Loops", "Using while loops to automate code.", "Detailed notes here."),
            arrayListOf("Lists&Array", "Store data as a set in lists or arrays.", "Detailed notes here."),
            arrayListOf("ArrayLists", "We can add and remove items at will and make changes to each item.", "Detailed notes here.")
        )

        val RecycKotlin = findViewById<RecyclerView>(R.id.recyKotlin)
        RecycKotlin.adapter = RVAdapter(this, items)
        RecycKotlin.layoutManager = LinearLayoutManager(this)

        title = "Kotlin Review"
    }
}