package com.raag.stepview

/*
* Diseño y desarrollo:
* Ramiro Abad Gómez
* Android Developer
* */

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.raag.stepview.databinding.ActivityIntroBinding
import com.shuhart.stepview.StepView

class Intro : AppCompatActivity() {
    //listado de pasos y descripciones
    private val pasos = arrayListOf("Paso 1", "Paso 2", "Paso 3", "Paso 4")
    private val descripcion = arrayListOf("Descripción 1", "Descripción 2", "Descripción 3", "Descripción 4")
    private val img = arrayListOf("https://firebasestorage.googleapis.com/v0/b/reportes-72bd5.appspot.com/o/Se%C3%B1alizacion%2FSe%C3%B1al%C3%A9tica%20(1)_001.png?alt=media&token=d6d1f767-eb2f-4e1a-bfbd-7b89e760484b",
        "https://firebasestorage.googleapis.com/v0/b/reportes-72bd5.appspot.com/o/Se%C3%B1alizacion%2FSe%C3%B1al%C3%A9tica%20(1)_002.png?alt=media&token=d6fa61ff-6ef5-4d97-85a8-d6ee677996e6",
        "https://firebasestorage.googleapis.com/v0/b/reportes-72bd5.appspot.com/o/Se%C3%B1alizacion%2FSe%C3%B1al%C3%A9tica%20(1)_004.png?alt=media&token=f79f7fdd-8d0e-4bc7-a923-62cd37f256a6",
        "https://firebasestorage.googleapis.com/v0/b/reportes-72bd5.appspot.com/o/Se%C3%B1alizacion%2FSe%C3%B1al%C3%A9tica%20(1)_009.png?alt=media&token=de1e17c1-7d13-45da-a40d-9ff4910711ed",)
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
                    0 -> {
                        titulo.text = pasos[position]
                        tvDescripcion.text = descripcion[position]
                        Glide.with(this@Intro).load(img[position]).into(image)
                    }

                    1 -> {
                        titulo.text = pasos[position]
                        tvDescripcion.text = descripcion[position]
                        Glide.with(this@Intro).load(img[position]).into(image)
                    }

                    2 -> {
                        titulo.text = pasos[position]
                        tvDescripcion.text = descripcion[position]
                        Glide.with(this@Intro).load(img[position]).into(image)
                    }

                    3 -> {
                        titulo.text = pasos[position]
                        tvDescripcion.text = descripcion[position]
                        Glide.with(this@Intro).load(img[position]).into(image)
                    }
                }
            }

        }

    }

}