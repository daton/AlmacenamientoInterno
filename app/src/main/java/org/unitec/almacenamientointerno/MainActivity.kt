package org.unitec.almacenamientointerno

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var archivaldo="usuario"
        var usu=Usuario();
        usu.nombre="Juan Carlos";
       usu.edad=46
      //  var fos=openFileOutput(archivaldo, Context.MODE_PRIVATE)
     // var ob=ObjectOutputStream(fos)
      //  ob.writeObject(usu)
      // fos.close()


        var ajustes=getSharedPreferences("prefeRegistro",0)
        var valor=   ajustes.getBoolean("registrado",false)
        if(valor){
            var i= Intent(applicationContext,ActivididadMenu::class.java);
            startActivity(i)
        }


        registrarse.setOnClickListener {
            var ajustes=getSharedPreferences("prefeRegistro",0)
         //   var editor=ajustes.edit();
          //  editor.putBoolean("registrado", true)
         //   editor.commit()
            var u=Usuario();
                  var fis=openFileInput("usuario")
            var ob=ObjectInputStream(fis);
           u= ob.readObject() as Usuario;
            ob.close()
            Toast.makeText(applicationContext,"Recuepradoooo "+u.nombre, Toast.LENGTH_LONG).show()

        }




    }
}
