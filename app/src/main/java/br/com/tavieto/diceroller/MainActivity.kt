package br.com.tavieto.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView

class MainActivity : AppCompatActivity() {

    private lateinit var button: AppCompatButton
    private lateinit var imageView: AppCompatImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.roll_button)
        imageView = findViewById(R.id.dice_imageView)

        rollDice()

        button.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val diceNumber = (1..6).random()
        val drawableResource = setDiceImage(diceNumber)
        imageView.setImageResource(drawableResource)
    }

    private fun setDiceImage(diceNumber: Int): Int {
        return when(diceNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}