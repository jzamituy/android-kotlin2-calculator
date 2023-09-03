package com.jzamit.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import android.util.Log
import androidx.compose.material3.TopAppBarDefaults


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
    Scaffold(topBar = { Toolbar() }, content = { paddingValues ->
        Log.d("ViewContainer", "$paddingValues")
        Content(paddingValues)
    })
}


@PreviewParameter(PaddingValuesProvider::class)
@Composable
fun Content(paddingValues: PaddingValues) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        item {

            Image(painter = painterResource(id = R.drawable.androiddev), contentDescription = null)
            // Generate text to test scrolling
            for (i in 1..40) {
                Text(text = "Android App")
                Text(text = "Amazing things will come")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Toolbar() {
    TopAppBar(
        title = { Text(text = "Testing toolbar", color = Color.Black) },
        colors = TopAppBarDefaults.topAppBarColors(Color.Magenta)
    )
}

abstract class PaddingValuesProvider : PreviewParameterProvider<PaddingValues>
