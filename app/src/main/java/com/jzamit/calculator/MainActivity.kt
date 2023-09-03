package com.jzamit.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewContainer()
        }
    }
}




@Preview(showBackground = true)
@Composable
fun ViewContainer() {
    Scaffold(topBar = { Toolbar()}, content = {Content() })
}



@Preview
@Composable
fun Content() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
           , horizontalAlignment = Alignment.CenterHorizontally,


    ) {
        item {
            Spacer(modifier = Modifier.fillMaxSize().height(64.dp))

            Image(painter= painterResource(id = R.drawable.androiddev), contentDescription = null)
            Text(text = "Android App")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")
            Text(text = "Amazing things will come")
            Text(text = "2024 is coming")


        }


    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview()
@Composable
fun Toolbar() {
TopAppBar(title = { Text(text = "Probando toolbar", color = Color.Green)}, modifier = Modifier.background(Color.Gray))
}

/*

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculatorTheme {
        Greeting("Android")
    }
}*/
