package com.example.studyapp

import android.app.Activity
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val items = arrayListOf(
            arrayListOf("Project Setup", "Setting up an Android Studio Project.", "Detailed notes here."),
            arrayListOf("Console", "Printing to the console.", "Detailed notes here."),
            arrayListOf("Resource Files", "Make changes resource file colours.xml and theme.xml to set a base color for each widget.", "Detailed notes here."),
            arrayListOf("UI Elements", "Creating, modifying, and initializing UI Elements.", "Detailed notes here."),
            arrayListOf("OnClickListener", "Use the OnClickListener to change of your Text Views with the click of a button.", "Detailed notes here."),
            arrayListOf("Snackbar", "We can use a Snackbar to display alerts in our application.", "Detailed notes here."),
            arrayListOf("Recycler Views", "Recycler Views are a great way to display long lists of items to the user.", "Detailed notes here."),
            arrayListOf("Shared Preferences", "allow us to save data to the user's device.", "Detailed notes here.")
            )
        val RecyAndroid = findViewById<RecyclerView>(R.id.recyAndroid)
        RecyAndroid.adapter = StudyAdapter(this, items)
        RecyAndroid.layoutManager = LinearLayoutManager(this)
        title = "Android Review"
    }
}