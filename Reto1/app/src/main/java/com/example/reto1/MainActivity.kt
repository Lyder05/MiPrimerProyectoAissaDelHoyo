package com.example.reto1

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val cbAndroid = findViewById<CheckBox>(R.id.cbAndroid)
        val cbReact = findViewById<CheckBox>(R.id.cbReact)
        val cbFlutter = findViewById<CheckBox>(R.id.cbFlutter)

        val btnGuardar = findViewById<Button>(R.id.btnGuardar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnGuardar.setOnClickListener {

            val seleccionadas = mutableListOf<String>()

            if (cbAndroid.isChecked) {
                seleccionadas.add("Android")
            }

            if (cbReact.isChecked) {
                seleccionadas.add("React")
            }

            if (cbFlutter.isChecked) {
                seleccionadas.add("Flutter")
            }

            if (seleccionadas.isNotEmpty()) {
                tvResultado.text = "Tecnologías seleccionadas: ${seleccionadas.joinToString(", ")}"
            } else {
                tvResultado.text = "No has seleccionado ninguna tecnología"
            }
        }

        val rgModalidad = findViewById<RadioGroup>(R.id.rgModalidad)
        val btnGuardar2 = findViewById<Button>(R.id.btnGuardar2)

        btnGuardar2.setOnClickListener {

            val idSeleccionado = rgModalidad.checkedRadioButtonId

            if (idSeleccionado != -1) {
                val radioSeleccionado =
                    findViewById<RadioButton>(idSeleccionado)

                tvResultado.text =
                    "Modalidad seleccionada: ${radioSeleccionado.text}"
            } else {
                tvResultado.text = "No has seleccionado ninguna modalidad"
            }
        }

        val seekBar = findViewById<SeekBar>(R.id.skNivel)
        val tvNivel = findViewById<TextView>(R.id.tvNivel)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(
                seekBar: SeekBar?,
                progress: Int,
                fromUser: Boolean
            ) {
                tvNivel.text = "Nivel seleccionado: $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.svMain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}