import model.Persona
import view.PersonaView

fun main(args: Array<String>) {

    val personaView = PersonaView()

    personaView.pedirDatosCompletos()
    personaView.PedirDatosIncompletos()
    personaView.porDefecto()

}

