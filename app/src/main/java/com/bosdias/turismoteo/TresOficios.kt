package com.bosdias.turismoteo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.gms.maps.MapView

class TresOficios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tres_oficios)
        val tv4 = findViewById<TextView>(R.id.tv8)
        val fbBoton = findViewById<ImageButton>(R.id.fbBoton)
        val igBoton = findViewById<ImageButton>(R.id.igBoton)
        val correoBoton1 = findViewById<ImageButton>(R.id.botonCorreo)


        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es/maps/place/%22TresOficios%22+Rodrigo+Mosquera/@42.7813116,-8.6198432,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f0353c0b8ef11:0x8fdff40917400c68!8m2!3d42.7813211!4d-8.6176898?hl=es")))
        }
        tv4.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tresoficios.es/gl/static/about.html")))
        }
        fbBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/tresoficios")))
        }
        igBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/?next=/tresoficios/")))
        }
        val botonTelefono = findViewById<ImageButton>(R.id.botonTelefono)
        botonTelefono.setOnClickListener {
            val phone = "tel: +34 696501621";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }

        correoBoton1.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("contacto@tresoficios.es")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "Estimado Rodrigo,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }
        val facebook = findViewById<ImageButton>(R.id.facebook)
        facebook.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/turismoteo/")))
        }
        val twitter = findViewById<ImageButton>(R.id.twitter)
        twitter.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/turismoteo")))
        }
        val instagram = findViewById<ImageButton>(R.id.instagram)
        instagram.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/?next=/turismoteo/")))
        }
        val wikiloc = findViewById<ImageButton>(R.id.wikiloc1)
        wikiloc.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikiloc.com/wikiloc/user.do?id=6776439")))
        }
        val info = findViewById<ImageButton>(R.id.info)
        info.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/es/oficina-de-turismo")))
        }
    }
}