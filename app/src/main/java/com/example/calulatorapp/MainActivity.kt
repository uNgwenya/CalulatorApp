package com.example.calulatorapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.editTextText)
        val number2 = findViewById<EditText>(R.id.editTextText2)

        val btnAdd = findViewById<Button>(R.id.buttonAdd)
        val btnSubtract = findViewById<Button>(R.id.buttonSubtract)
        val btnMultiply = findViewById<Button>(R.id.buttonMultiply)
        val btnDivide = findViewById<Button>(R.id.buttonDivide)

        val resultText = findViewById<TextView>(R.id.textView5)

        btnAdd.setOnClickListener{
            val num1= number1.text.toString().toInt()
            val num2= number2.text.toString().toInt()

            val sum= num1 + num2

            resultText.text ="Result= $sum"
        }

        btnSubtract.setOnClickListener {
            val num1=number1.text.toString().toInt()
            val num2=number2.text.toString().toInt()

            val result= num1 - num2

            resultText.text="Result= $result"
        }

        btnMultiply.setOnClickListener {
            val num1=number1.text.toString().toInt()
            val num2=number2.text.toString().toInt()

            val result= num1 * num2

            resultText.text="Result= $result"
        }

        btnDivide.setOnClickListener {
            val num1=number1.text.toString().toInt()
            val num2=number2.text.toString().toInt()

            val result= num1/num2

            resultText.text="Result= $result"

        }
    }
}
