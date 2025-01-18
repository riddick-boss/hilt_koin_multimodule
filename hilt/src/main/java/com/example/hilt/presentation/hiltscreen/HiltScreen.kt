package com.example.hilt.presentation.hiltscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController

@androidx.compose.runtime.Composable
fun HiltScreen(
    navController: NavController,
    viewModel: HiltViewModel = hiltViewModel()
) {
    val text by viewModel.textFlow.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue.copy(alpha = 0.3f)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Hilt Screen",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium
            )
            ElevatedButton(
                onClick = navController::popBackStack
            ) {
                Text(
                    text = "Go back"
                )
            }
        }
    }
}