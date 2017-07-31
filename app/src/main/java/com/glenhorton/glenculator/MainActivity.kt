package com.glenhorton.glenculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        plus.setOnClickListener { toast("Answer is : ${Integer.parseInt(editText.text.toString()) + Integer.parseInt(editText2.text.toString())}") }
//        minus.setOnClickListener { toast("Answer is : ${Integer.parseInt(editText.text.toString()) - Integer.parseInt(editText2.text.toString())}") }
//        into.setOnClickListener { toast("Answer is : ${Integer.parseInt(editText.text.toString()) * Integer.parseInt(editText2.text.toString())}") }
//        divide.setOnClickListener { toast("Answer is : ${Integer.parseInt(editText.text.toString()) / Integer.parseInt(editText2.text.toString())}") }

    }

    fun pressNumber (view: View) {
        // Get the text view
        val showCountTextView = findViewById(R.id.textview_numDisplay) as TextView

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Multiply the value of the text view by 10 and add the button number
        var count: Int = Integer.parseInt(countString)
        count = count * 10
        when (view.getId()) {
            R.id.zero -> count = count + 0
            R.id.one -> count = count + 1
            R.id.two -> count = count + 2
            R.id.three -> count = count + 3
            R.id.four -> count = count + 4
            R.id.five -> count = count + 5
            R.id.six -> count = count + 6
            R.id.seven -> count = count + 7
            R.id.eight -> count = count + 8
            R.id.nine -> count = count + 9
        }

        // Display the new value in the text view.
        showCountTextView.text = count.toString();
    }
}
