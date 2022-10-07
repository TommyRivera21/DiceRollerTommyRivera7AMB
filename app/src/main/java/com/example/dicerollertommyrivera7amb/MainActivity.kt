package com.example.dicerollertommyrivera7amb

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**

    Esta actividad permite al usuario tirar un dado y ver el resultado.
    en la pantalla.

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }

    /**
     *
     *  Tira el dado el dado y muestra su resultado
     * */
    private fun rollDice() {
        /** Crea un nuevo objeto dado con 6 lados y lo lanza */
        val dice = Dice(6)
        val diceRoll = dice.roll()

        /** Actualiza la pantalla con el resultado del dado*/
        val resulTextView: TextView = findViewById(R.id.textView)
        resulTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}