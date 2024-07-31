@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.newcompose

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newcompose.ui.theme.NewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.TopCenter)
        ) {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Details")
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { /* Handle navigation icon click */ }) {
                        Icon(Icons.Rounded.ArrowBack, contentDescription = "Navigation Icon")
                    }
                }
            )
            Column {
                Image(
                    painter = painterResource(id = R.drawable.new_image),
                    contentDescription = "Detail image",
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text = "Language",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 6.dp, top = 10.dp)
                )
            }
            Row(modifier = Modifier.padding(top = 10.dp)) {
                Text(text = "1525")
                Icon(
                    Icons.Rounded.Star,
                    contentDescription = null,
                    modifier = Modifier.padding(start = 2.dp),
                    tint = Color.Yellow
                )
                Text(text = "Python", modifier = Modifier.padding(start = 10.dp))
                Box(modifier = Modifier
                    .padding(top = 2.dp, start = 2.dp)
//                    .aspectRatio(1f)
                    .size(20.dp)
                    .background(Color.Blue, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                }
//                Text(text = "\uD83D\uDD35", modifier = Modifier.padding(start = 2.dp))

                Text(text = "347", modifier = Modifier.padding(start = 10.dp))
//                Text(text = "\uD83D\uDD35", modifier = Modifier.padding(start = 2.dp))
                Image(painter = painterResource(id = R.drawable.fork1), contentDescription ="Fork",
                    modifier = Modifier.width(30.dp))
            }
            Row(
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Text(
                    text = "Shared repository for open-sourced" + "\n" +
                            "projects from the Google AI " + "\n" +
                            "Language team"
                )
            }
        }
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
                .width(250.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF003366))
        ) {
            Text(text = "Show Issues")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewComposeTheme {
        Greeting("Android")
    }
}