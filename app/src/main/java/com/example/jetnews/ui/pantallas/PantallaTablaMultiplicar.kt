package com.example.jetnews.ui.pantallas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PantallaTablaMultiplicar(navController: NavController) {
    var numero by remember { mutableStateOf("") }
    var tabla by remember { mutableStateOf<List<String>>(emptyList()) }

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp).verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Tabla de Multiplicar", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = numero,
            onValueChange = { numero = it },
            label = { Text("Ingresa un número") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            val n = numero.toIntOrNull()
            if (n != null) {
                tabla = (1..10).map { "$n x $it = ${n * it}" }
            }
        }) { Text("Calcular") }
        Spacer(modifier = Modifier.height(16.dp))
        tabla.forEach { linea ->
            Text(linea, fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedButton(onClick = { navController.popBackStack() }) { Text("Regresar") }
    }
}