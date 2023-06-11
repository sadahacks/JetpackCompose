package com.example.jetpackcompose.ui

import androidx.cardview.widget.CardView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Ui {

    @Composable
    fun ImageCard(
        painter: Painter,
        description:String,
        title:String
    ){
        Card(modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp) {
            Box(modifier = Modifier
                .height(200.dp)
                .width(100.dp)){
                Image(painter = painter,
                    contentDescription = description,
                contentScale = ContentScale.Crop)
                Box(modifier = Modifier.fillMaxWidth().background(
                    Brush.verticalGradient(colors = listOf(
                        Color.Transparent,
                        Color.Black
                    ),startY = 5f
                    )
                ))
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                    contentAlignment = Alignment.BottomCenter
                ){
                    Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
                }

            }
        }
    }
}