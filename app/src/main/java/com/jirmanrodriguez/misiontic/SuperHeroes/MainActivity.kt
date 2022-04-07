package com.jirmanrodriguez.misiontic.SuperHeroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jirmanrodriguez.misiontic.SuperHeroes.Adapter.SuperHeroAdapter
import com.jirmanrodriguez.misiontic.recyclerviewanimals.R

/* 1. implementar librerias:
* - implementation 'com.squareup.picasso:picasso:2.71828'
* - implementation"androidx.recyclerview:recyclerview-selection:1.1.0"
* 2.vamos al activity_main para crear el recyclerview
*   - cambiamos por framelayout
*   - insertamos un recyclerview
* 3. creamos  la Dataclass ---> new kotlin class ---> SuperHero
*   - como funciona un recyclerview ---> nosotros le pasamos un listado de datos  a un adapter el se va a encargar
*      de esos datos a decir tu covierteme esto en una vista, tu carga esto, tu muestra esto
*   - necesitamos datos para mostrar, 4 atributos, se crea por medio de una data class
 4. creamos una class donde colocamos el listado de superheroes ---> SuperHeroProvider
    - vamos a crear una variable que va hacer una lista de superheroe.
 5. creamos un pachage --->adapter
    - creamos un archivo class ---> SuperHeroAdapter (
    - creamos un archivo class ---> superHeroVieHolder
 6. creamos un layout ---> item_superHero
 7. codeamos el viewholder
 8. regresamos al adapter para realizar el onbind
 9. regresamos a la ----> mainActivity
 10. para mostrar imagenes colocamos esta libreria ---> implementation 'com.github.bumptech.glide:glide:4.13.0'
  annotationProcessor 'com.github.bumptech.glide:compiler:4.13.0'
  - regresamos a adapter y llamamos a glide.
  11. vamos a pedir permiso de internet
  --> en manifest --->    <uses-permission android:name="android.permission.INTERNET"/>

    -
 */



class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            initRecyclerView()
    }
// creamos un metodo  y la llamamos, cuando se cree esta activity, se cargue en el movil va a llamar a este metodo.
private fun initRecyclerView(){
        // vamos a recuperar el recyclerview de la activity main

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)
    // accedemos a el
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superheroList)

    }
}