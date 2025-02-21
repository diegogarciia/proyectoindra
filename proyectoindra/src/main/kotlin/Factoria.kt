class Factoria {
    companion object {
        fun crearEvento(): Evento {
            var bucle = true
            var evento = Evento()
            Comentarios().preguntaeventonombre
            evento.nombre = readln().toString()
            while (bucle) {
                Comentarios().preguntaeventotipo
                evento.tipo = readln().toString().uppercase()
                if (evento.tipo == TIPOEVENTO.values().toString()) {
                    evento.tipo = TIPOEVENTO.values().toString()
                    bucle = false
                }  else {
                    bucle
                }
            }
            Comentarios().preguntaeventoduracion
            evento.duracion = readln().toInt()
            evento.ubicacion = crearUbicacion()
            return evento
        }

        fun crearUbicacion(): Ubicacion {
            var bucle = true
            var ubicacion = Ubicacion()
            while (bucle) {
                Comentarios().preguntaubicaciontipo
                ubicacion.tipo = readln().toString().uppercase()
                if (ubicacion.tipo == TIPOUBICACION.values().toString()) {
                    ubicacion.tipo = TIPOUBICACION.values().toString()
                    bucle = false
                } else {
                    bucle
                }
            }
            Comentarios().preguntaubicaciondireccion
            ubicacion.direccion = readln().toString()
            return ubicacion
        }

        fun crearUsuario(): Usuario {
            var usuario = Usuario()
            Comentarios().preguntausuarionombre
            usuario.nombre = readln().toString()
            Comentarios().preguntausuariocorreo
            usuario.correoelectronico = readln().toString()
            Comentarios().preguntausuariocontrasenia
            usuario.contrasenia = readln().toString()
            return usuario
        }

        fun crearOrganizador(): Organizador {
            var organizador = Organizador()
            Comentarios().preguntarorganizadornombre
            organizador.nombre = readln().toString()
            Comentarios().preguntaorganizadorcontacto
            organizador.contacto = readln().toString()
            return organizador
        }

        fun crearInscripcion(): Inscripcion {
            var inscripcion = Inscripcion()
            Comentarios().preguntainscripcionevento
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