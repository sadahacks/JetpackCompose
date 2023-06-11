package com.example.jetpackcompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme


@Preview(showBackground = true)
@Composable
fun BirthdayCardUi(){
    JetpackComposeTheme {
        BirthdayCardFromImage()
    }
}


@Composable
fun BirthdayCardFromImage(){
    val image= painterResource(id = R.drawable.sada1)
    Box {
        Image(painter = image,
            contentDescription = null,
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        contentScale = ContentScale.Crop)

        BirthdayCardFromText()
    }


}

@Composable
fun BirthdayCardFromText(){
    Column {
        Text(
            "Happy Birthday Sada!",
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(start = 16.dp, top = 16.dp))


        Text(text = "from Sid",
        fontSize = 24.sp,
        modifier = Modifier.fillMaxWidth().
        wrapContentWidth(Alignment.End)
            .padding(start = 16.dp , end = 16.dp))
    }
}



