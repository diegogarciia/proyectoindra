import java.util.Date

class Evento {
    var nombre = " "
    var tipo = " "
    var fecha = Date()
    var duracion = 0
    var ubicacion = Ubicacion()
    var asistentes = ArrayList<Usuario>()
    var inscripciones = ArrayList<Inscripcion>()
    var cancelarevento = false

    constructor()
    constructor(
        nombre: String,
        tipo: String,
        fecha: Date,
        duracion: Int,
        ubicacion: Ubicacion,
        asistentes: ArrayList<Usuario>,
        inscripciones: ArrayList<Inscripcion>,
        cancelarevento: Boolean
    ) {
        this.nombre = nombre
        this.tipo = tipo
        this.fecha = fecha
        this.duracion = duracion
        this.ubicacion = ubicacion
        this.asistentes = asistentes
        this.inscripciones = inscripciones
        this.cancelarevento = cancelarevento
    }


}