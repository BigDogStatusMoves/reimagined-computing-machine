package com.example.skuta.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var gamesList: ListView
    lateinit var listOfGames: ArrayList<GamesModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gamesList = findViewById(R.id.list_view)
        listOfGames = insertData()

        gamesList.adapter = GamesAdapter(this, R.layout.gameslist_layout,listOfGames)

    }

    private fun insertData(): ArrayList<GamesModel> {
        var list = ArrayList<GamesModel>()

        val gameNames = arrayOf(
            "Call of Duty: Modern Warfare II",
            "Counter-Strike: Global Offensive",
            "Dead By Daylight",
            "Guilty Gear -STRIVE-",
            "Guilty Gear Xrd REV 2",
            "League of Legends",
            "Minecraft",
            "Overwatch 2",
            "Street Fighter V",
            "Valorant"
        )

        val gamePrices = doubleArrayOf(69.99,0.00,24.99,39.99,29.99,0.00,19.99,29.99,0.00,0.00)

        val gameImages = intArrayOf(
            R.drawable.mw2ghost,
            R.drawable.csgo,
            R.drawable.dbd,
            R.drawable.ggs,
            R.drawable.ggxrd,
            R.drawable.lol,
            R.drawable.mc,
            R.drawable.ow2,
            R.drawable.sfv,
            R.drawable.`val`
        )

        for (i in gameNames.indices)
            list.add(GamesModel(gameNames[i],gameImages[i],gamePrices[i]))




        return list
    }
}