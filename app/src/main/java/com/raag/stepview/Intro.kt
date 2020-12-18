package com.raag.stepview

/*
* Diseño y desarrollo:
* Ramiro Abad Gómez
* Android Developer
* */

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raag.stepview.databinding.ActivityIntroBinding
import com.shuhart.stepview.StepView

class Intro : AppCompatActivity() {
    //listado de pasos y descripciones
    private val pasos = arrayListOf("Paso 1", "Paso 2", "Paso 3", "Paso 4")
    private val descripcion = arrayListOf("Descripción 1", "Descripción 2", "Descripción 3", "Descripción 4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityIntroBinding.inflate(layoutInflater).apply{
        setContentView(root)

            //declaración del objeto
            stepView.state
                    //declara cuantos pasos tiene
                    .stepsNumber(4)
                    //declara el tipo de animación
                    .animationType(StepView.ANIMATION_ALL)
                    //declara la duración de la animación
                    .animationDuration(resources.getInteger(android.R.integer.config_shortAnimTime))
                    //lo inicia
                    .commit()
            //declara el métoco onClic sobre cada paso
            stepView.setOnStepClickListener { position ->
                //Declara el arranque de la animación
                stepView.go(position, true)
                when(position){
                    0 -> {titulo.text = pasos[position]
                        tvDescripcion.text = descripcion[position]}

                    1 -> {titulo.text = pasos[position]
                        tvDescripcion.text = descripcion[position]}

                    2 -> {titulo.text = pasos[position]
                        tvDescripcion.text = descripcion[position]}

                    3 -> {titulo.text = pasos[position]
                        tvDescripcion.text = descripcion[position]}
                }
            }

        }

    }

}