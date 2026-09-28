package com.example.jetnews.ui.pantallas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PantallaAreaRectangulo(navController: NavController) {
    var base by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Área de un Rectángulo", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = base, onValueChange = { base = it }, label = { Text("Base") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(value = altura, onValueChange = { altura = it }, label = { Text("Altura") }, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            val b = base.toDoubleOrNull()
            val h = altura.toDoubleOrNull()
            if (b != null && h != null) {
                resultado = "El área es: ${b * h}"
            } else {
                resultado = "Ingresa valores válidos"
            }
        }) { Text("Calcular Área") }
        Spacer(modifier = Modifier.height(16.dp))
        Text(resultado, fontSize = 20.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedButton(onClick = { navController.popBackStack() }) { Text("Regresar") }
    }
}