package com.jirmanrodriguez.misiontic.SuperHeroes.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jirmanrodriguez.misiontic.recyclerviewanimals.R
import com.jirmanrodriguez.misiontic.SuperHeroes.SuperHero

/* va a extender o a sobre escribir (dos puntos)
 - .adapter <va el nombre del viewholder>()
 - agragamos miembros oncreate ;onbidend ; get
 - el adpatador tiene que recibir el listado ;class SuperHeroAdapter(val superHerolist : list <superhero>)
 - oncreate --->Devuelve al viewholder , se le pasa el item, layout que va a modificar
   creamos un layout --->item_superHero

       */
class SuperHeroAdapter(private val superheroList: List<SuperHero>) : RecyclerView.Adapter<SuperHeroVieHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVieHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroVieHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: SuperHeroVieHolder, position: Int) {
  /* este metodo basicamente va a pasar por cada uno de los items y va a llamar al superhero render, pasandoles ese item.
     creamos una varible ---> item   */
        val item = superheroList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = superheroList.size
        // devuelve el tamaño del listado
     // return  superheroList.size
    }
