package com.mintic.tienda.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mintic.tienda.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.registro
import kotlinx.android.synthetic.main.activity_perfil_usuario.*

class PerfilUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_usuario)
        editar.setOnClickListener{
            val intent = Intent(this, RegistroUsuarioActivity::class.java)
            startActivity(intent)
        }
    }
}