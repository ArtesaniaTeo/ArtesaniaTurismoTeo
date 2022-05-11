package com.bosdias.turismoteo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity


import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.gms.maps.MapView

class Silvereira : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silvereira)
        val logoTeo = findViewById<ImageButton>(R.id.logoTeo)

        logoTeo.setOnClickListener {
            startActivity(Intent
                (Intent.ACTION_VIEW, Uri.parse("https://turismo.teo.gal/gl")))
        }
        val tv4 = findViewById<TextView>(R.id.tv8)
        val igBoton = findViewById<ImageButton>(R.id.igBoton)
        val correoBoton1 = findViewById<ImageButton>(R.id.botonCorreo)
        val fbBoton = findViewById<ImageButton>(R.id.fbBoton)
        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Silvereira+Joyas/@42.8343777,-8.6102264,17z/data=!3m1!4b1!4m5!3m4!1s0xd2f021dd97a570f:0xb1a264a2c18d38b!8m2!3d42.8343738!4d-8.6080377")))
        }
        val botonTelefono = findViewById<ImageButton>(R.id.botonTelefono)
        botonTelefono.setOnClickListener {
            val phone = "tel: +34 981548659";
            val intent = Intent (Intent.ACTION_DIAL);
            intent.setData(Uri.parse(phone));
            startActivity(intent);
        }


        tv4.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.silvereira.com/")))
        }

        fbBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://es-es.facebook.com/Olgamartinezcostura/")))
        }
        igBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/?next=/silvereira_joyas/")))
        }
        correoBoton1.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@silvereira.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Información acerca de...")
            intent.putExtra(Intent.EXTRA_TEXT, "Estimado Juan,...")
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