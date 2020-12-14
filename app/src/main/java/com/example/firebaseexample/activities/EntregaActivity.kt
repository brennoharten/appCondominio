package com.example.firebaseexample.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.firebaseexample.R

class EntregaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var entregaButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrega)

        entregaButton = findViewById(R.id.entrega_button_confirmar)
        entregaButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.entrega_button_confirmar -> {
                val it = Intent(this, MainActivity::class.java)
                startActivity(it)
            }

        }
    }
}