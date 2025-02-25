import java.util.*

class Factoria {
    companion object {
        fun crearEvento(): Evento {
            val evento = Evento()
            evento.nombre = generarNombreAleatorio()
            evento.tipo = TIPOEVENTO.values().random().name
            evento.duracion = Constantes().randomHorasEvento() // Duración aleatoria entre 1 y 8 horas
            evento.fecha = generarFechaAleatoria()
            evento.ubicacion = crearUbicacion()
            return evento
        }

        fun crearUbicacion(): Ubicacion {
            val ubicacion = Ubicacion()
            ubicacion.tipo = TIPOUBICACION.values().random().name
            ubicacion.direccion = generarDireccionAleatoria()
            return ubicacion
        }

        fun crearUsuario(): Usuario {
            val nombres = listOf("Laura", "Carlos", "Elena", "Pedro", "Ana", "David")
            val dominios = listOf("gmail.com", "hotmail.com", "outlook.com")
            val nombre = nombres.random()
            val email = "$nombre${Constantes().random1A100()}@${dominios.random()}"

            val usuario = Usuario()
            usuario.nombre = nombre
            usuario.correoelectronico = email
            usuario.contrasenia = "${nombre}123"
            return usuario
        }

        fun crearOrganizador(): Organizador {
            val organizador = Organizador()
            organizador.nombre = "Organizador ${(Constantes().random1A100())}"
            organizador.contacto = "${organizador.nombre}@${Constantes().random1A100()}@email.com"
            return organizador
        }

        fun crearInscripcion(evento: Evento): Inscripcion {
            val inscripcion = Inscripcion()
            inscripcion.evento = evento.nombre
            return inscripcion
        }

        fun generarNombreAleatorio(): String {
            val prefijos = listOf("Mega", "Ultra", "Super", "Tech", "Innovative")
            val sufijos = listOf("Summit", "Hackathon", "Conference", "Workshop", "Expo")
            return "${prefijos.random()} ${sufijos.random()}"
        }

        fun generarDireccionAleatoria(): String {
            val calles = listOf("Calle Mayor", "Avenida Central", "Plaza del Sol", "Gran Vía", "Paseo de Gracia")
            val numero = Constantes().random1A100()
            return "${calles.random()} $numero"
        }

        fun generarFechaAleatoria(): Date {
            val calendar = Calendar.getInstance()
            calendar.add(Calendar.DAY_OF_YEAR, Constantes().random1A365())
            return calendar.time
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