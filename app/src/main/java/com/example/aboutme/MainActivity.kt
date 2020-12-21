package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.view.inputmethod.InputMethodManager
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickName(it)
        }

    }

    private fun addNickName(view: View){
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknNameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknNameTextView.text = editText.text
        editText.visibility = View.GONE
        nicknNameTextView.visibility = View.VISIBLE
        view.visibility = View.GONE

        val imm= getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)


    }
}