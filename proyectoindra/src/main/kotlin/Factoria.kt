class Factoria {
    companion object {
        fun crearEvento(): Evento {
            var evento = Evento()
            Comentarios().preguntaeventonombre
            evento.nombre = readln().toString()
            Comentarios().preguntaeventotipo
            evento.tipo
            Comentarios().preguntaeventoduracion
            evento.duracion = readln().toInt()
            evento.ubicacion = crearUbicacion()
            return evento
        }

        fun crearUbicacion(): Ubicacion {
            var ubicacion = Ubicacion()
            Comentarios().preguntaubicaciontipo
            ubicacion.tipo
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

    enum class tipoevento {
        CONFERENCIA,
        TALLER
    }

    enum class tipoubicacion {
        ONLINE,
        FISICO
    }

}