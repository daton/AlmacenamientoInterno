package org.unitec.almacenamientointerno

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_preregistro.*

class ActivityPreregistro : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preregistro)

        recuperar.setOnClickListener {

            var ajustes=getSharedPreferences("prefe",0)
         var valor=   ajustes.getFloat("yo",22f)
            Toast.makeText(applicationContext,"Holaaa"+valor, Toast.LENGTH_LONG).show()

        }
    }
}
