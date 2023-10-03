package com.example.liar.screens

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.liar.R
import com.example.liar.navigation.Screen


@Preview()
@Composable
fun MainScreen(navController: NavHostController) {
    val activity = (LocalContext.current as? Activity)
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {


    Column(modifier = Modifier
        .fillMaxHeight(0.5f)
        .background(Color.White),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
        ) { Image(painter = painterResource(id = R.drawable.liar_image)
        ,contentDescription = "img1",
            modifier = Modifier.size(450.dp))
    }
    Column(modifier = Modifier.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {

        Spacer(modifier = Modifier.size(40.dp))
        Button(onClick = {
                         navController.navigate(route = Screen.Choose.route)
                         },
            modifier = Modifier.size(width = 260.dp, height = 70.dp)) {
            Text(text ="Play",
                fontSize = 40.sp)
        }
        Button(onClick = {
                            navController.navigate(route = Screen.Rules.route)
                         },
            modifier = Modifier.size(width = 260.dp, height = 70.dp)) {
            Text(text = "How to play",
                fontSize = 40.sp)
        }
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.size(width = 260.dp, height = 70.dp)) {
            Text(text = "Collection",
                fontSize = 40.sp)
        }
        Button(onClick = { activity?.finish() },
            modifier = Modifier.size(width = 260.dp, height = 70.dp)) {
            Text(text = "Exit",
                fontSize = 40.sp)

        }

    }
    }


}