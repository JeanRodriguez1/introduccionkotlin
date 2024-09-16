package com.example.introduccionkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object{
        const val moneda = "EUR"
    }
    var saldo : Float = 300.54f
    var sueldo : Float = 764.82f
    var entero : Int = 62




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }

        val fecha = "05/07/1997" // Val es un dato que no se cambia
        //           0123456789

        var nombre: String = "jota" // var si cambia
        var vip : Boolean = false
        var inicial : Char = 'J'

        var saludo = "Hola " + nombre

        if( vip == true ) saludo += ", te quiero"
        else saludo += ", quieres ser vip ?"

        var mes = fecha.subSequence(3, 5).toString().toInt()

        when(mes){
            1, 2, 3, -> print ("\n Hola" )
            4, 5, 6, -> print ("\n Hola cabezon" )
            else -> print ("\n Noooooooo" )
        }



        println (saludo)




    }

}