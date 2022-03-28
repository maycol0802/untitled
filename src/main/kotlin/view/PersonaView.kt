package view

import controller.PersonaController
import model.Persona


open class PersonaView() : PersonaController() {

    val personaC = PersonaController()
    val persona1 = Persona()
    val persona2 = Persona()
    val persona3 = Persona("Maycol", 22, 208010893, 'H', 60f, 173f)

    fun pedirDatosCompletos() {
        println("Digite su nombre: ")
        persona1.nombre = readLine().toString()!!
        println("Digite su edad: ")
        persona1.edad = readLine()?.toInt()!!
        println("Digite su sexo (H / M): ")
        persona1.sexo = readLine()!![0]
        println("Digite su peso: ")
        persona1.peso = readLine()?.toFloat()!!
        println("Digite su altura: ")
        persona1.altura = readLine()?.toFloat()!!

        println(personaC.toString(persona1.nombre, persona1.edad, persona1.sexo, persona1.peso, persona1.altura))

        println(personaC.calcularIMC(persona1.peso))

        personaC.comprobarSexo( persona1.sexo)

        println(personaC.esMayorDeEdad(persona1.edad))
    }

    fun PedirDatosIncompletos() {
        println("Digite su nombre: ")
        persona2.nombre = readLine().toString()!!
        println("Digite su edad: ")
        persona2.edad = readLine()?.toInt()!!
        println("Digite su cedula: ")
        persona2.cedula = readLine()?.toInt()!!
        println("Digite su sexo (H / M): ")
        persona2.sexo = readLine()!![0]

        println(personaC.toString(persona2.nombre, persona2.edad, persona2.sexo, persona2.peso, persona2.altura))

        println(personaC.calcularIMC(persona2.peso))

        personaC.comprobarSexo( persona2.sexo)

        println(personaC.esMayorDeEdad(persona2.edad))
    }

    fun porDefecto(){
        println(personaC.toString(persona3.nombre, persona3.edad, persona3.sexo, persona3.peso, persona3.altura))

        println(personaC.calcularIMC(persona3.peso))

        personaC.comprobarSexo( persona3.sexo)

        println(personaC.esMayorDeEdad(persona3.edad))

    }

}