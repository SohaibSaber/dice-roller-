package com.example.myapplication

import android.widget.Toast

class RollDice {


    fun diceRoll(): Int {
        var randomNum = (1..6).random()

        var imageDice: Int = when (randomNum) {
            1 -> {
                R.drawable.dice_1
            }
            2 -> {
                R.drawable.dice_2
            }
            3 -> {
                R.drawable.dice_3
            }
            4 -> {
                R.drawable.dice_4
            }
            5 -> {
                R.drawable.dice_5
            }
            else -> {
                R.drawable.dice_6
            }
        }
        return imageDice
    }
}