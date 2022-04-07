package com.jirmanrodriguez.misiontic.SuperHeroes.Adapter
// recibe por parametro la vista

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jirmanrodriguez.misiontic.recyclerviewanimals.R
import com.jirmanrodriguez.misiontic.SuperHeroes.SuperHero
import org.w3c.dom.Text

class SuperHeroVieHolder(view:View) : RecyclerView.ViewHolder(view) {
//tenemos que acceder a las vistas del --> item_superhero ; tenemos que generar esas variables para acceder a ellas.

    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realname= view.findViewById<TextView>(R.id.tvRealname)
    val Publisher= view.findViewById<TextView>(R.id.tvPublisher)
    val photo =    view.findViewById<ImageView>(R.id.ivsuperHero)

// creamos una funcion llamada render, va a recibir una objeto superhero, esta funcion se va ha llamar  por cada
// item del listado de superheroe automaticamente.
// se va asignar el valor del objeto superhero a cada uno de estos textview
fun render (superHeroModel: SuperHero){

    superHero.text = superHeroModel.superHeroName
    realname.text = superHeroModel.realName
    Publisher.text =superHeroModel.publisher
    Glide.with(photo.context).load(superHeroModel.image).into(photo)

}



}