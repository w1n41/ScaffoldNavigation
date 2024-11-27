package com.example.scaffoldnavigation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationScreen(
    modifier: Modifier,
){
    val navHostController = rememberNavController()
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = Screens.firstScreen
    ){
        composable(Screens.firstScreen) {
            FirstScreen(navHostController)
        }
        composable(Screens.secondScreen) {
            SecondScreen(navHostController)
        }
    }
}

object Screens{
    const val firstScreen = "FirstScreen"
    const val secondScreen = "SecondScreen"
}