package com.example.jetnews.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TarjetaPresentacion() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // 1. Fotografía (usamos un ícono de ejemplo por ahora)
        Image(
            painter = painterResource(id = android.R.drawable.ic_menu_myplaces),
            contentDescription = "Fotografía de perfil",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 2. Nombre completo
        Text(
            text = "Alexis González",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 3. Profesión / Carrera
        Text(
            text = "Estudiante de Desarrollo de Aplicaciones Móviles",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 4. Correo electrónico
        Text(
            text = "✉ alexis@ejemplo.com",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 5. Número de teléfono
        Text(
            text = "📞 +503 1234 5678",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 6. Botón de contacto (sin funcionalidad por ahora)
        Button(
            onClick = { /* Sin acción, solo decorativo */ },
            modifier = Modifier.fillMaxWidth(0.7f)
        ) {
            Text(text = "Contactar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaPreview() {
    MaterialTheme {
        TarjetaPresentacion()
    }
}