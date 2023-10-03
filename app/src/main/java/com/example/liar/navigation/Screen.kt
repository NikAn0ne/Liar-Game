package com.example.liar.navigation

const val COUNTER_KEY = "counter"
const val TEAM_KEY = "team"
sealed class Screen(val route: String) {
    object Main: Screen(route = "main_screen")
    object Rules: Screen(route = "rules_screen")
    object Game: Screen(route = "game_screen/{$COUNTER_KEY}/{$TEAM_KEY}"){
        fun passCounter(counter: Int): String{
            return this.route.replace(oldValue = "{$COUNTER_KEY}", newValue = counter.toString())
        }
        fun passTeamAndCounter(
            counter: Int,
            team: String
        ): String{
            return "game_screen/$counter/$team"
        }
    }
    object Choose: Screen(route = "choose_screen")
}
