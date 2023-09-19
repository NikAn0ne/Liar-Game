package com.example.liar.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liar.R

@Preview
@Composable
fun RulesScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier
            .fillMaxHeight(0.5f),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.question_icon),
                contentDescription = "imgQuestion",
                modifier = Modifier
                    .size(300.dp)
                    .padding(24.dp))
            Text(text = "How to play",
                fontSize = 40.sp)
        }
        Column(modifier = Modifier.fillMaxHeight()) {
            Card(modifier = Modifier.fillMaxSize()
                .padding(32.dp)) {
                Text(text = "The rules are simple.\n Each team first selects the player to answer (IMPORTANT players should not be repeated in the round).  Then all players choose the theme for the competition. After selecting a theme, there is a discussion between the selected players as to how many words they can name on the topic. Players can at any moment say \"Liar\" and then on whom the score stopped should call such a number of words and was the bet(For example: Player 1 said he could say 13 words on the subject, Player 2 could say 15, Player 1 did not believe him and said \"Liar\", Player 2 should say 15 words on the topic or he lost).",
                    modifier = Modifier.padding(20.dp),
                    fontSize = 16.sp)
            }

        }

    }
}