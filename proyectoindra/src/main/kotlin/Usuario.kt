class Usuario {
    var nombre = " "
    var correoelectronico = " "
    var contrasenia = " "
    var eventosapuntados = ArrayList<Evento>()
    var cancelarinscripcion = false

    constructor()
    constructor(
        nombre: String,
        correoelectronico: String,
        contraseña: String,
        eventosapuntados: ArrayList<Evento>,
        cancelarinscripcion: Boolean
    ) {
        this.nombre = nombre
        this.correoelectronico = correoelectronico
        this.contrasenia = contraseña
        this.eventosapuntados = eventosapuntados
        this.cancelarinscripcion = cancelarinscripcion
    }

    fun eventosApuntado(evento: Evento) {
        eventosapuntados.add(evento)
    }

}