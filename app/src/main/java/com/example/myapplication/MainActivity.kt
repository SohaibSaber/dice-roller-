package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

      lateinit var roll_btn : Button
      lateinit var dice_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         roll_btn = findViewById(R.id.dice_btn)
        dice_image = findViewById(R.id.dice_image)

        roll_btn.setOnClickListener {
            diceRoll()
        }

    }

    public fun diceRoll() {
        var randomNum = (1..6).random()

        var imageDice : Int
        when (randomNum) {
            1 -> {
                imageDice = R.drawable.dice_1
            }
            2 -> {
                imageDice = R.drawable.dice_2
            }
            3 -> {
                imageDice = R.drawable.dice_3
            }
            4 -> {
                imageDice = R.drawable.dice_4
            }
            5 -> {
                imageDice = R.drawable.dice_5
            }
            else -> {
                imageDice = R.drawable.dice_6
            }
        }
        dice_image.setImageResource(imageDice)
        Toast.makeText(this,"Dice rolled",Toast.LENGTH_SHORT).show()
    }
}