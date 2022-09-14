package com.ulima.edu.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.ulima.edu.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowText()
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridGen() {
    LazyVerticalGrid(cells = GridCells.Fixed(3), content = {
        items(9) { j ->
            Box(modifier = Modifier
                .padding(8.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.White),
            contentAlignment = Alignment.Center) {
                Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxSize()) {
                    Text(text = "Boton $j")
                }
            }
        }
    })
}



@Composable
@Preview(showBackground = true)
fun ShowText() {
    TicTacToeTheme {
        Column() {
            GridGen()
            Box(modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green),
                contentAlignment = Alignment.Center) {Text(text = "Player 1")}
        }
        
    }
}