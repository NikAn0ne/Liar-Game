package com.example.liar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.liar.screens.GameScreen
import com.example.liar.screens.MainScreen
import com.example.liar.screens.RulesScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {
        composable(
            route = Screen.Main.route
        ) {
            MainScreen(navController)
        }
        composable(
            route = Screen.Rules.route
        ) {
            RulesScreen(navController)
        }
        composable(
            route = Screen.Game.route
        ) {
            GameScreen(navController)
        }
    }
}