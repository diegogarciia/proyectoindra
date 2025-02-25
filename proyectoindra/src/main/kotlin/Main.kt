fun main(args: Array<String>) {
    var listaeventos = ArrayList<Evento>()
    var contadoreventos = 0
    var contadornumeroinscripciones: Int
    var contadornumerousuarios: Int
    while (contadoreventos < Constantes().numeroeventos) {
        var organizador = Factoria.crearOrganizador()
        var evento = organizador.crearEvento()
        contadornumeroinscripciones = 0
        contadornumerousuarios = 0
        while (contadornumeroinscripciones < Constantes().numeroinscripcionesporevento) {
            var inscripcion = Factoria.crearInscripcion(evento)
            while (contadornumerousuarios < Constantes().numerousuariosporinscripcion ) {
                var usuario = Factoria.crearUsuario()
                inscripcion.anadirusuario(usuario)
                evento.anadirasistente(usuario)
                usuario.anadirEventosApuntado(evento)
                contadornumerousuarios++
            }
            evento.anadirinscripcion(inscripcion)
            contadornumeroinscripciones++
        }
        listaeventos.add(evento)
        contadoreventos++
    }
    imprimirEventos(listaeventos)
}

fun imprimirEventos(eventos: ArrayList<Evento>) {
    for (i in eventos.indices) {
        println("${eventos[i]}\n")
    }
}