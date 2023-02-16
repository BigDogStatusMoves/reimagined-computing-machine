package com.example.skuta.myapplication

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class GamesAdapter (var adapterContext: Context,
                    var myResource: Int,
                    var games: ArrayList<GamesModel>): ArrayAdapter<GamesModel>(adapterContext,myResource,games) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val layoutInflater = LayoutInflater.from(adapterContext)
            val gamesView = layoutInflater.inflate(myResource,null)

            val title = gamesView.findViewById<TextView>(R.id.game_title)
            val price = gamesView.findViewById<TextView>(R.id.game_price)
            val image = gamesView.findViewById<ImageView>(R.id.game_image)

            title.text = games[position].name
            price.text = "$" + games[position].price.toString()
            image.setImageResource(games[position].image)

            return gamesView
        }
}