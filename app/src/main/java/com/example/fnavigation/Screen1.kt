package com.example.fnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Screen1(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "Tela 1") }
        }

    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {
            Text(text = "Tela 1")
            Button(onClick = {navController.navigate(Destination.ScreenSecond.route)}) {
                Text(text = "Proxima Tela")
            }
            Button(onClick = {navController.navigate(Destination.ScreenThird.route)}) {
                Text(text = "Tela 3")
            }
        }
    }
}
