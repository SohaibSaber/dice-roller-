package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.myapplication.RollDice as RollDice1

class MainActivity : AppCompatActivity() {

    lateinit var rollBtn: Button
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollBtn = findViewById(R.id.dice_btn)
        diceImage = findViewById(R.id.dice_image)

        val rollDice = RollDice1()

        rollBtn.setOnClickListener {
            rollDice.diceRoll()
            Toast.makeText(this, "Dice rolled", Toast.LENGTH_SHORT).show()
        }

    }

}