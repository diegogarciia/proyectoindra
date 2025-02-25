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

    fun modificarEvento(evento: Evento, listaeventos: ArrayList<Evento>): Evento {
        var bucle = true
        do {
            println("¿Qué dato quieres modificar?")
            println("1. Nombre")
            println("2. Tipo")
            println("3. Duracion")
            println("4. Ubicacion")
            println("5. Cancelar evento")
            var opcion = readln().toInt()
            when(opcion) {
                1 -> {
                    evento.nombre = readln().toString()
                    bucle = false
                }
                2 -> {
                    var bucletipo = true
                    while (bucletipo) {
                        var tipo = readln().toString().uppercase()
                        if (tipo == Factoria.TIPOEVENTO.values().toString()) {
                            evento.tipo = Factoria.TIPOEVENTO.values().toString()
                            bucletipo = false
                        }  else {
                            bucletipo
                        }
                    }
                    bucle = false
                }
                3 -> {
                    evento.duracion = readln().toInt()
                    bucle = false
                }
                4 -> {
                    var bucleubicacion = true
                    while (bucleubicacion) {
                        evento.ubicacion.tipo = readln().toString().uppercase()
                        if (evento.tipo == Factoria.TIPOUBICACION.values().toString()) {
                            evento.tipo = Factoria.TIPOUBICACION.values().toString()
                            bucleubicacion = false
                        } else {
                            bucleubicacion
                        }
                    }
                    evento.ubicacion.direccion = readln().toString()
                    bucle = false
                }
                5 -> {
                    var buclecancelarevento = true
                    while (buclecancelarevento) {
                        var respuesta = readln().toString().uppercase()
                        if (respuesta == "SI") {
                            listaeventos.remove(evento)
                        } else {
                            buclecancelarevento = false
                        }
                    }
                    bucle = false
                }
            }
        } while (bucle)
        return evento
    }

    override fun toString(): String {
        return "Organizador(nombre = '$nombre', contacto = '$contacto')"
    }

}