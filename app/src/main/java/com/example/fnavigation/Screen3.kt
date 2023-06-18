package com.example.fnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun Screen3(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "Tela 3") }
        }
    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {
            Text(text = "Tela 3")
            Button(onClick = { navController.navigate(Destination.ScreenFourth.route) }) {
                Text(text = "Proxima tela")
            }
            Button(onClick = {navController.navigateUp()}) {
                Text(text = "Voltar a tela 2")
            }
            Button(onClick = {navController.navigate(Destination.ScreenFive.route)}) {
                Text(text = "Tela 5")
            }
        }
    }

}