class Inscripcion {
    var usuarios = ArrayList<Usuario>()
    var evento = ""

    constructor()
    constructor(usuarios: ArrayList<Usuario>, evento: String) {
        this.usuarios = usuarios
        this.evento = evento
    }

    fun anadirusuario(usuario: Usuario) {
        usuarios.add(usuario)
    }

}