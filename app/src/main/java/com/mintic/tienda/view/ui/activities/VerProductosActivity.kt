package com.mintic.tienda.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mintic.tienda.R
import kotlinx.android.synthetic.main.activity_principal.*
import kotlinx.android.synthetic.main.activity_principal.openButton
import kotlinx.android.synthetic.main.activity_ver_productos.*

class VerProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_productos)
        imageButton2.setOnClickListener{
            val intent = Intent(this, OrdenCompraActivity::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener{
            val intent = Intent(this, PerfilUsuarioActivity::class.java)
            startActivity(intent)
        }
    }
}