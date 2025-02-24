class Factoria {
    companion object {
        fun crearEvento(): Evento {
            var bucle = true
            var evento = Evento()
            evento.nombre = readln().toString()
            while (bucle) {
                evento.tipo = readln().toString().uppercase()
                if (evento.tipo == TIPOEVENTO.values().toString()) {
                    evento.tipo = TIPOEVENTO.values().toString()
                    bucle = false
                }  else {
                    bucle
                }
            }
            evento.duracion = readln().toInt()
            evento.ubicacion = crearUbicacion()
            return evento
        }

        fun crearUbicacion(): Ubicacion {
            var bucle = true
            var ubicacion = Ubicacion()
            while (bucle) {
                ubicacion.tipo = readln().toString().uppercase()
                if (ubicacion.tipo == TIPOUBICACION.values().toString()) {
                    ubicacion.tipo = TIPOUBICACION.values().toString()
                    bucle = false
                } else {
                    bucle
                }
            }
            ubicacion.direccion = readln().toString()
            return ubicacion
        }

        fun crearUsuario(): Usuario {
            var usuario = Usuario()
            usuario.nombre = readln().toString()
            usuario.correoelectronico = readln().toString()
            usuario.contrasenia = readln().toString()
            return usuario
        }

        fun crearOrganizador(): Organizador {
            var organizador = Organizador()
            organizador.nombre = readln().toString()
            organizador.contacto = readln().toString()
            return organizador
        }

        fun crearInscripcion(): Inscripcion {
            var inscripcion = Inscripcion()
            inscripcion.evento = readln().toString()
            return inscripcion
        }
    }

    enum class TIPOEVENTO {
        CONFERENCIA,
        TALLER
    }

    enum class TIPOUBICACION {
        ONLINE,
        FISICO
    }

}