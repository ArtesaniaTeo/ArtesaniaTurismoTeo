package com.bosdias.turismoteo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.gms.maps.MapView

class SpaciobInteriorismo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spaciob_interiorismo)
        val tv4 = findViewById<TextView>(R.id.tv8)
        val fbBoton = findViewById<ImageButton>(R.id.fbBoton)
        val igBoton = findViewById<ImageButton>(R.id.igBoton)
        val linkedinBoton = findViewById<ImageButton>(R.id.linkedinBoton)
        val correoBoton1 = findViewById<ImageButton>(R.id.botonCorreo)
        val maps = findViewById<ImageButton>(R.id.maps)
        maps.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/spaciob/@42.8715567,-8.5540763,17z/data=!3m1!4b1!4m5!3m4!1s0xd2eff547b9250df:0xda314b30cf7d85e7!8m2!3d42.8715528!4d-8.5518876")))
        }


        tv4.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spaciob.com/")))
        }
        fbBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/spaciob/")))
        }
        igBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/accounts/login/?next=/spaciob/")))
        }
        linkedinBoton.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/authwall?trk=gf&trkInfo=AQEmspbdCl8xfwAAAYBGibbAqJQRlwmjwA6Hsi54wlUNPUtYfAh86LLjaBIE4aJNy7jCDLewpBLSCKyRWqZI_D_ddTi0Xx5eikLIPqEvHf86_89AZj_BYc_BXI1AvVG8rSumD8M=&originalReferer=https://www.spaciob.com/&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2F18809948%2Fadmin%2F")))
        }
        correoBoton1.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            val recipients = arrayOf("info@spaciob.com")
            intent.putExtra(Intent.EXTRA_EMAIL, recipients)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto:")
            intent.putExtra(Intent.EXTRA_TEXT, "Estimada Bea,...")
            intent.type = "text/html"
            intent.setPackage("com.google.android.gm")
            startActivity(Intent.createChooser(intent, "Send mail"))
        }


    }
}