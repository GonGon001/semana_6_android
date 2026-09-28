package com.example.jetnews.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetnews.ui.pantallas.*

// Rutas
object Rutas {
    const val BIENVENIDA = "bienvenida"
    const val MENU = "menu"
    const val TABLA = "tabla"
    const val AREA = "area"
    const val FORMULARIO = "formulario"
}

@Composable
fun AppNavegacion() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.BIENVENIDA) {
        composable(Rutas.BIENVENIDA) { PantallaBienvenida(navController) }
        composable(Rutas.MENU) { PantallaMenu(navController) }
        composable(Rutas.TABLA) { PantallaTablaMultiplicar(navController) }
        composable(Rutas.AREA) { PantallaAreaRectangulo(navController) }
        composable(Rutas.FORMULARIO) { PantallaFormulario(navController) }
    }
}