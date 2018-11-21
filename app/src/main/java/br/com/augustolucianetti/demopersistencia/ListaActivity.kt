package br.com.augustolucianetti.demopersistencia

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
    }

    override fun onResume() {
        super.onResume()
        val sharedPreferences = getSharedPreferences("meuapp", Context.MODE_PRIVATE)

        val usuario = sharedPreferences.getString("USUARIO", "")

        tvNome.text = usuario
    }
}
