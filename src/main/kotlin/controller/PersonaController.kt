package controller

import model.Persona
import kotlin.math.pow

open class PersonaController : Persona(){

    fun toString(nombre : String, edad : Int, sexo : Char, peso : Float, altura : Float): String {
        val persona = Persona()
        persona.nombre = nombre
        persona.edad = edad
        persona .sexo = sexo
        persona.peso = peso
        persona.altura = altura
        return "$nombre $edad $sexo $peso $altura"
    }

    fun comprobarSexo(sexo: Char){
        if(sexo == 'H' || sexo == 'h' || sexo == 'M' || sexo == 'm'){
            println("Sexo correcto")
        }else{
            sexoReal = sexo
        }
    }


    fun esMayorDeEdad(edad: Int): Boolean {
        if(edad >= 18){
            return true
        }else {
            return false
        }
    }

    fun calcularIMC(peso : Float): Int {
        var IMC : Float = peso / (altura.pow(2))
        if(IMC <  18.5){
            return bajoPeso
        }else if(IMC >= 18.5 && IMC <= 24.9){
            return normalPeso
        }else{
            return sobrePeso
        }
    }



}