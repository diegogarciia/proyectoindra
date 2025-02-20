class Factoria {
    companion object {
        fun crearEvento(): Evento {
            var evento = Evento()

            return evento
        }

        fun crearUbicacion(): Ubicacion {
            var ubicacion = Ubicacion()

            return ubicacion
        }

        fun crearUsuario(): Usuario {
            var usuario = Usuario()

            return usuario
        }

        fun crearOrganizador(): Organizador {
            var organizador = Organizador()

            return organizador
        }

        fun crearInscripcion(): Inscripcion {
            var inscripcion = Inscripcion()

            return inscripcion
        }
    }

    enum class tipoubicacion {
        ONLINE,
        FISICO
    }

}