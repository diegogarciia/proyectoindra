class Constantes {
    var numeroeventos = 2
    var numeroinscripciones = 2
    var numerousuarios = 10
    var numeroinscripcionesporevento = numeroinscripciones / numeroeventos
    var numerousuariosporinscripcion = numerousuarios / numeroinscripciones

    fun randomHorasEvento(): Int {
        var horas = (1..8).random()
        return horas
    }

    fun random1A100(): Int {
        var numero = (1..100).random()
        return numero
    }

    fun random1A365(): Int {
        var numero = (1..365).random()
        return numero
    }
}