package dev.campi.diffutil

data class Objeto (
    var id: Int,
    var titulo: String,
    var mensaje: String
) {
    companion object {
        val listaDeCuatro = listOf(
            Objeto(1, "Titulo Companion 1", "Mensajes 1"),
            Objeto(1, "Titulo Companion 2", "Mensajes 2"),
            Objeto(1, "Titulo Companion 3", "Mensajes 3"),
            Objeto(1, "Titulo Companion 4", "Mensajes 4")
        )
    }
}