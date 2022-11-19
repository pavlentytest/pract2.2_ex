package ru.samsung.itschool.mdev.myapplication

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
        tv = findViewById(R.id.textView)
        editText.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
            override fun afterTextChanged(p0: Editable?) {
                if(p0.toString().isNotEmpty()) {
                    val kg = p0.toString().toInt()
                    val gramm = kg * 1000
                    tv.text = "$gramm gramm"
                }
            }
        })

       // Toast.makeText(this,resources.getText(R.string.ncreate), Toast.LENGTH_LONG).show()
    }


}