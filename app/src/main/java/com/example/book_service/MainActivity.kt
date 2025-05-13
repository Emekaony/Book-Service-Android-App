package com.example.book_service

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.book_service.presentation.ListBookScreen
import com.example.book_service.ui.theme.Book_ServiceTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        println("onCreate function was called!")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Book_ServiceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   ListBookScreen(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.teal_700))
            .padding(WindowInsets.statusBars.asPaddingValues()) // avoid the safe area
            .padding(start = 10.dp)
    ) {
        Text ("${stringResource(R.string.greeting)} $name")
        Image(painter = painterResource(R.drawable.book_jacket), contentDescription = null)
        Box(
            modifier = Modifier
                .size(250.dp) // width & height
                .border(2.dp, Color.Red, shape = RoundedCornerShape(30.dp)) // border thickness & color
                .clip(RoundedCornerShape(30.dp))
                .background(Color.LightGray) // background color
                .padding(16.dp) // inner spacing
        ) {
           Column (
               modifier = Modifier.fillMaxHeight(),
               verticalArrangement = Arrangement.SpaceBetween
           ) {
               Text("Hello Box!", color = Color.Black)
               Text("alvari", color = colorResource(R.color.purple_500))
               Row (
                   modifier = Modifier.fillMaxWidth(),
                   horizontalArrangement = Arrangement.SpaceBetween
               ) {
                   Text("Hello Box!", color = Color.Black)
                   Text("alvari", color = colorResource(R.color.purple_500))
               }
           }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Book_ServiceTheme {
        Greeting("Android")
    }
}