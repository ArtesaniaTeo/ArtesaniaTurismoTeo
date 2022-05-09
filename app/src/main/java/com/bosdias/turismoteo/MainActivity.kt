package com.bosdias.turismoteo


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TurismoTeo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tv1 = findViewById<TextView>(R.id.tv1)

        val logoTeo = findViewById<ImageButton>(R.id.logoTeo)

        logoTeo.setOnClickListener {
            val viewIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://turismo.tekjughjyyjuo.gal"))
            if (viewIntent.resolveActivity(packageManager) != null) {
                startActivity(viewIntent)
            }


        }


        val informacionBoton = findViewById<ImageButton>(R.id.informacionBoton)
        informacionBoton.setOnClickListener {startActivity(Intent
            (Intent.ACTION_VIEW, Uri.parse("https://www.teo.gal/")))
        }

//       //a ver esto funcionaba:
        val botonFacebook = findViewById<ImageButton>(R.id.botonFacebook)
        botonFacebook.setOnClickListener {
            startActivity(Intent
                (Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/")))
        }

        //e este non, pero se sacamos a sentenza if si que funciona
//        val botonfacebook = findViewById<ImageButton>(R.id.botonFacebook)
//        botonfacebook.setOnClickListener {
//            val viewIntent1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/"))
//            if (viewIntent1.resolveActivity(packageManager) != null) { startActivity(viewIntent1) }
//       }

        val botonInstagram = findViewById<ImageButton>(R.id.botonInstagram)
        botonInstagram.setOnClickListener {
            startActivity(Intent
                (Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/turismoteo/")))
        }
        val botonTwitter = findViewById<ImageButton>(R.id.botonTwitter)
        botonTwitter.setOnClickListener {
            startActivity(Intent
                (Intent.ACTION_VIEW, Uri.parse("https://twitter.com/turismoteo")))
        }



        val brigantiaOrfebre = findViewById<ImageButton>(R.id.boton1)
        brigantiaOrfebre.setOnClickListener {
            val acceder = Intent(this, BrigantiaOrfebres::class.java)
            startActivity(acceder)
        }
        val oliXiraldez = findViewById<ImageButton>(R.id.boton2)
        oliXiraldez.setOnClickListener {
            val acceder = Intent(this, OliXiraldez::class.java)
            startActivity(acceder)
        }
        val silvereira = findViewById<ImageButton>(R.id.boton3)
        silvereira.setOnClickListener {
            val acceder = Intent(this, Silvereira::class.java)
            startActivity(acceder)
        }
        val spacioB = findViewById<ImageButton>(R.id.boton4)
        spacioB.setOnClickListener {
            val acceder = Intent(this, SpaciobInteriorismo::class.java)
            startActivity(acceder)
        }
        val rosamendez = findViewById<ImageButton>(R.id.boton5)
        rosamendez.setOnClickListener {
            val acceder = Intent(this, RosaMendez::class.java)
            startActivity(acceder)
        }
        val macala = findViewById<ImageButton>(R.id.boton6)
        macala.setOnClickListener {
            val acceder = Intent(this, MacalaXoias::class.java)
            startActivity(acceder)
        }
        val tresOficios = findViewById<ImageButton>(R.id.boton7)
        tresOficios.setOnClickListener {
            val acceder = Intent(this, TresOficios::class.java)
            startActivity(acceder)
        }
        val arteCelta = findViewById<ImageButton>(R.id.boton8)
        arteCelta.setOnClickListener {
            val acceder = Intent(this, ArteCelta::class.java)
            startActivity(acceder)
        }
        val alalaCouture = findViewById<ImageButton>(R.id.boton9)
        alalaCouture.setOnClickListener {
            val acceder = Intent(this, AlalaCouture::class.java)
            startActivity(acceder)
        }
        val iagoSalgado = findViewById<ImageButton>(R.id.boton10)
        iagoSalgado.setOnClickListener {
            val acceder = Intent(this, IagoSalgado::class.java)
            startActivity(acceder)
        }
        val pabloSeoane = findViewById<ImageButton>(R.id.boton11)
        pabloSeoane.setOnClickListener {
            val acceder = Intent(this, PabloSeoane::class.java)
            startActivity(acceder)
        }
        val olgaMartinez = findViewById<ImageButton>(R.id.boton12)
        olgaMartinez.setOnClickListener {
            val acceder = Intent(this, OlgaMartinez::class.java)
            startActivity(acceder)
        }


    }

}