package com.example.myapplication
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)

    }
    private var newOp = true
    private var op = "+"
    private var oldNumber = ""
    fun operatorCase(view: View) {
        newOp = true
        oldNumber = findViewById<EditText>(R.id.editt).text.toString()
        val buttonSel: Button = view as Button
        when(buttonSel.text.toString()){
            "+" -> op = "+"
            "*" -> op = "*"
            "/" -> op = "/"
            "-" -> op = "-"
            "%"-> op = "%"
        }
        findViewById<EditText>(R.id.ed).setText(op)
    }
    fun equalCase(view: View) {
        val newNumber: String = findViewById<EditText>(R.id.editText).text.toString()
        var result = 0.0
        when (op) {
            "+" -> {
                result = oldNumber.toDouble() + newNumber.toDouble()
            }
            "*" -> {
                result = oldNumber.toDouble() * newNumber.toDouble()
            }
            "/" -> {
                result = oldNumber.toDouble() / newNumber.toDouble()
            }
            "-" -> {
                result = oldNumber.toDouble() - newNumber.toDouble()
            }

        }
        this.findViewById<EditText>(R.id.ed).setText(result.toString())

        newOp = true
    }
}