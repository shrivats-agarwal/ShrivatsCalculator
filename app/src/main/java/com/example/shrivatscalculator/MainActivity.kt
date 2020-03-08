package com.example.Shrivatscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.shrivatscalculator.R
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var number1: TextView
    lateinit var number2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SHRIVATS", "**** ONCREATE ****")
        setContentView(R.layout.activity_main)
        tv = findViewById<TextView>(R.id.sum)
        number1 = findViewById<TextView>(R.id.number1)
        number2 = findViewById<TextView>(R.id.number2)

        var calculate = findViewById<Button>(R.id.calculate)
    }

    override fun onStart() {
        super.onStart()
        Log.d("SHRIVATS", "****** ONSTART *****")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SHRIVATS", "***** onResume ****")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SHRIVATS", " ***** ONSTOP ******")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("SHRIVATS", "***** onDestroy *****")
    }


    fun calculate(view: View) {
        var sum = add(
            Integer.parseInt(number1.text.toString()),
            Integer.parseInt(number2.text.toString())
        )
        Log.d("Sum is ", sum.toString());
        tv.text = sum.toString()
    }

    fun study(view: View) {
        val value1 = Integer.parseInt(number1.text.toString())
        val value2 = Integer.parseInt(number2.text.toString())
        var result = sub(value1, value2)
        Log.d("result is ", result.toString())
        tv.text = result.toString()
    }

    //Subtraction
    fun sub(number1: Int, number2: Int): Int {
        Log.d("Number 1", number1.toString())
        Log.d("number 2", number2.toString())
        return number1 - number2
    }

    //Add
    fun add(number1: Int, number2: Int): Int {
        Log.d("Number 1 ", number1.toString())
        Log.d("Number 2 ", number2.toString())
        return number1 + number2
    }

    fun pro(view: View) {
        val value1 = Integer.parseInt(number1.text.toString())
        val value2 = Integer.parseInt(number2.text.toString())
        var cricket = multiply(value1, value2)
        Log.d("cricket is", cricket.toString())
        tv.text = cricket.toString()

    }

    //Multiplication
    fun multiply(number1: Int, number2: Int): Int {
        Log.d("Number 1", number1.toString())
        Log.d("number 2", number2.toString())
        return number1 * number2
    }

    fun redmi(view: View) {
        val value1 = Integer.parseInt(number1.text.toString())
        val value2 = Integer.parseInt(number2.text.toString())
        var iphone = divide(value1, value2)
        Log.d("iphone is", iphone.toString())
        tv.text = iphone.toString()

    }

    //Division
    fun divide(number1: Int, number2: Int): Int {
        Log.d("number 1", number1.toString())
        Log.d("number 2", number2.toString())
        return number1 / number2

    }
}
