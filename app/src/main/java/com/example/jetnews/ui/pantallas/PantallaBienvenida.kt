package com.example.jetnews.ui.pantallas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetnews.ui.Rutas

@Composable
fun PantallaBienvenida(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("¡Bienvenido!", fontSize = 36.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
        Spacer(modifier = Modifier.height(16.dp))
        Text("App de Ejercicios Básicos de Programación", fontSize = 18.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(48.dp))
        Button(onClick = { navController.navigate(Rutas.MENU) }, modifier = Modifier.fillMaxWidth(0.7f)) {
            Text("Comenzar", fontSize = 18.sp)
        }
    }
}