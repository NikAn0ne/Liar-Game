package com.example.liar.navigation

sealed class Screen(val route: String) {
    object Main: Screen(route = "main_screen")
    object Rules: Screen(route = "rules_screen")
    object Game: Screen(route = "game_screen")
}
