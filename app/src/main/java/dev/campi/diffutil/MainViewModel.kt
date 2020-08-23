package dev.campi.diffutil

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val lista = listOf(
        Objeto(1, "Titulo 1 viewModel", "Mensaje 1"),
        Objeto(2, "Titulo 2 viewModel", "Mensaje 2"),
        Objeto(3, "Titulo 3 viewModel", "Mensaje 3"),
        Objeto(4, "Titulo 4 viewModel", "Mensaje 4"),
        Objeto(5, "Titulo 1 viewModel", "Mensaje 1"),
        Objeto(6, "Titulo 2 viewModel", "Mensaje 2"),
        Objeto(7, "Titulo 3 viewModel", "Mensaje 3"),
        Objeto(8, "Titulo 4 viewModel", "Mensaje 4")

    )
}