package com.example.jetpackcompose

import android.os.Bundle
import android.os.Message
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val scrollState = rememberScrollState()
//                    Greeting("Android")
                    Column(modifier = Modifier.verticalScroll(scrollState)) {
                        for (i in 1..30){
                            MyIntro("Sadaqat Hussain","How are you. I'm in Lahore and doing my job. Inshallah soon we'll meet. How are you. I'm in Lahore and doing my job. Inshallah soon we'll meet")
                        }

                        Ui().ImageCard(painter =painterResource(id = R.drawable.sada1) , description = "sada's University Pic", title = "SadaHacks")
                    }


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(verticalAlignment = Alignment.CenterVertically,modifier = Modifier.fillMaxHeight()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier.fillMaxWidth()) {
            Text(text = "Hello $name!")
            Text("Hello World",color = Color.Yellow)
            Text("0123456789",modifier = Modifier.background(color = Color.Blue))
            Text("XYZ")

            Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "logo")
        }
    }
}

@Composable
fun MyIntro(auther:String,msg:String){
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(R.drawable.sada1),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(8.dp))

        var isExpanded by remember { mutableStateOf(false) }

        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(text = auther,
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2)
            Spacer(modifier = Modifier.height(4.dp))


            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(
                    text = msg,
                    modifier = Modifier.padding(all = 4.dp),
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                    style = MaterialTheme.typography.body2
                )
            }
        }

    }
    Spacer(modifier = Modifier.height(15.dp))
}








@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
//        Greeting("Android")
//            MyIntro("Sadaqat Hussain","How are you. I'm in Lahore and doing my job. Inshallah soon we'll meet. How are you. I'm in Lahore and doing my job. Inshallah soon we'll meet")

        Box(modifier = Modifier.width(100.dp)){
            Ui().ImageCard(painter = painterResource(id = R.drawable.sada1) , description = "sada's University Pic", title = "SadaHacks")
        }

          }
}