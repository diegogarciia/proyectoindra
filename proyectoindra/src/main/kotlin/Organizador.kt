class Organizador {
    var nombre = " "
    var contacto = " "

    constructor()
    constructor(nombre: String, contacto: String) {
        this.nombre = nombre
        this.contacto = contacto
    }

    fun crearEvento(): Evento {
        var evento = Factoria.crearEvento()
        return evento
    }

    fun modificarEvento(evento: Evento): Evento {
        var eventomodificado = evento

        return evento
    }

}