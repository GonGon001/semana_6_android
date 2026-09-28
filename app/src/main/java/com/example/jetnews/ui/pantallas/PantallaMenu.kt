package com.example.jetnews.ui.pantallas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetnews.ui.Rutas

@Composable
fun PantallaMenu(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Menú de Ejercicios", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.navigate(Rutas.TABLA) }, modifier = Modifier.fillMaxWidth(0.8f)) { Text("Tabla de Multiplicar") }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(Rutas.AREA) }, modifier = Modifier.fillMaxWidth(0.8f)) { Text("Área de un Rectángulo") }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(Rutas.FORMULARIO) }, modifier = Modifier.fillMaxWidth(0.8f)) { Text("Formulario Personal") }
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedButton(onClick = { navController.popBackStack() }) { Text("Regresar") }
    }
}