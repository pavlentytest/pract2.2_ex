package ru.samsung.itschool.mdev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.widget.CalendarView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Calendar

class MainActivity2 : AppCompatActivity() {

    private lateinit var calendar: CalendarView
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        calendar = findViewById(R.id.calendarView)
        tv = findViewById(R.id.textView2)
        calendar.setOnDateChangeListener { calendarView, i, i2, i3 ->
            tv.text = "$i3-$i2-$i"
        }



    }
}