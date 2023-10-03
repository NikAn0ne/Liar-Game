package com.example.liar.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.liar.navigation.Screen
import java.lang.Integer.max

@Preview
@Composable
fun StartGameScreen(navController: NavController) {
    var counterA by remember {
        mutableStateOf(0)
    }
    var counterB by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF101010)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight(.5f)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Choose a term",
                fontSize = 48.sp,
                color = Color.Cyan
            )

        }

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Button(
                    onClick = { counterA++ },
                    colors = ButtonDefaults.buttonColors(Color.DarkGray),
                    modifier = Modifier
                        .size(height = 200.dp, width = 150.dp)
                        ,
                    shape = RectangleShape
                ) {
                    Text(text = "Team A",
                        fontSize = 28.sp,
                        color = Color.Cyan)

                }
                Button(
                    onClick = { counterB++ },
                    colors = ButtonDefaults.buttonColors(Color.DarkGray),
                    modifier = Modifier
                        .size(height = 200.dp, width = 150.dp)
                       ,
                    shape = RectangleShape
                ) {
                    Text(text = "Team B",
                        fontSize = 28.sp,
                        color = Color.Cyan)

                }


            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically)
            {
                Text(text = "A: $counterA", fontSize = 48.sp, color = Color.Cyan)
                Text(text = "B: $counterB", fontSize = 48.sp, color = Color.Cyan)
            }

            Button(modifier = Modifier.fillMaxWidth()
                .padding(16.dp),
                onClick = {
                    val counter = max(counterA,counterB)
                    val team = when(counter){
                        counterA->"Team A"
                        counterB->"Team B"
                        else -> "Team ?"
                    }
                    navController.navigate(route = Screen.Game.passTeamAndCounter(counter,team)) },
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                ) {
                Text(text = "Next", fontSize = 48.sp, color = Color.Cyan)

            }
        }

    }
}