package model

import view.PersonaView
import kotlin.math.pow

open class Persona {
    var nombre : String = ""
var edad : Int = 0
var cedula : Int = 0
var sexo : Char = 'M'
var peso : Float = 0.0f
var altura : Float = 0.0f
    var sexoReal : Char = 'H'

val sobrePeso : Int = 1
val bajoPeso : Int = -1
val normalPeso : Int = 0

    fun setPersonaNombre(vNombre : String){
        nombre = vNombre
    }

    fun setPersonaEdad(vEdad : Int){
        edad = vEdad
    }
    fun setPersonaCedula(vCedula : Int){
        cedula = vCedula
    }
    fun setPersonaSexo(vSexo : Char){
        sexo = vSexo
    }
    fun setPersonaPeso(vPeso : Float){
        peso = vPeso
    }
    fun setPersonaAltura(vAltura : Float){
        altura = vAltura
    }



    constructor(){
    }

    constructor(nombre: String, edad: Int, sexo: Char) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }

    constructor(nombre: String, edad: Int, cedula: Int, sexo: Char, peso: Float, altura: Float) {
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }












}