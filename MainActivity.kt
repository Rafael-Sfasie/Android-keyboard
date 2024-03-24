package com.example.keyboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.FillEventHistory
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial


class MainActivity : AppCompatActivity() {
    lateinit var editText : EditText
    val historyList = ArrayList<String>()
    lateinit var historyTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText=findViewById(R.id.keyboard_edit_text)
        val historyListView = findViewById<ListView>(R.id.history_list_view)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, historyList)
        historyListView.adapter = adapter

    }
    fun operationFunction(view: View){
        view.id

        when(view.id){
            R.id.button_one -> {
                val character = editText.text.toString() + "1"
                editText.setText(character)
            }
            R.id.button_two -> {
                val character = editText.text.toString() + "2"
                editText.setText(character)
            }
            R.id.button_three -> {
                val character = editText.text.toString() + "3"
                editText.setText(character)
            }
            R.id.button_four -> {
                val character = editText.text.toString() + "4"
                editText.setText(character)
            }
            R.id.button_five -> {
                val character = editText.text.toString() + "5"
                editText.setText(character)
            }
            R.id.button_six -> {
                val character = editText.text.toString() + "6"
                editText.setText(character)
            }
            R.id.button_seven -> {
                val character = editText.text.toString() + "7"
                editText.setText(character)
            }
            R.id.button_eight -> {
                val character = editText.text.toString() + "8"
                editText.setText(character)
            }
            R.id.button_nine -> {
                val character = editText.text.toString() + "9"
                editText.setText(character)
            }
            R.id.button_A -> {
                val character = editText.text.toString() + "A"
                editText.setText(character)
            }
            R.id.button_B -> {
                val character = editText.text.toString() + "B"
                editText.setText(character)
            }
            R.id.button_C -> {
                val character = editText.text.toString() + "C"
                editText.setText(character)
            }
            R.id.button_D -> {
                val character = editText.text.toString() + "D"
                editText.setText(character)
            }
            R.id.button_E -> {
                val character = editText.text.toString() + "E"
                editText.setText(character)
            }
            R.id.button_F -> {
                val character = editText.text.toString() + "F"
                editText.setText(character)
            }
            R.id.button_0 -> {
                val character = editText.text.toString() + "0"
                editText.setText(character)
            }
            R.id.button_back -> {
                editText.setText("")
            }
            R.id.button_OK -> {
                val character = editText.text.toString()
                historyList.add(character)
                editText.setText("")

                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, historyList)
                val historyListView = findViewById<ListView>(R.id.history_list_view)
                historyListView.adapter = adapter
            }

        }

    }
}