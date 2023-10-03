package com.example.liar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.liar.screens.GameScreen
import com.example.liar.screens.MainScreen
import com.example.liar.screens.RulesScreen
import com.example.liar.screens.StartGameScreen

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
            route = Screen.Game.route,
            arguments = listOf(navArgument(COUNTER_KEY){
                type = NavType.IntType
                defaultValue = 0
            },navArgument(TEAM_KEY){
                type = NavType.StringType
            }),

        ) {
            entry ->
            GameScreen(counter = entry.arguments?.getInt("counter"), team = entry.arguments?.getString(TEAM_KEY),navController)
        }
        composable(
            route = Screen.Choose.route
        ) {
           StartGameScreen(navController)
        }

    }
}