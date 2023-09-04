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
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
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


    Scaffold(topBar = { Toolbar() }, content = { paddingValues ->
        Log.d("ViewContainer", "$paddingValues")
        Content(paddingValues)
    }, floatingActionButton = { Fab() }, floatingActionButtonPosition = FabPosition.End)
}


//@PreviewParameter(PaddingValuesProvider::class)
@Composable
fun Content(paddingValues: PaddingValues) {
    var counter by rememberSaveable {
        mutableStateOf(0)
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        item {

            Image(painter = painterResource(id = R.drawable.androiddev), contentDescription = null)
            Row(modifier = Modifier
                .fillMaxSize()
                .background(Color.Blue)
                .height(40.dp)
                .padding(start = 10.dp, top = 10.dp, bottom = 10.dp)) {
                Image(painter = painterResource(id = R.drawable.ic_favorite), contentDescription = "Like heart", modifier= Modifier.clickable { counter++  })
                Text(text = counter.toString(), modifier= Modifier.padding(start = 5.dp) )
            }
            // Generate text to test scrolling
            for (i in 1..40) {
                Text(text = "Android App")
                Text(text = "Amazing things will come")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar() {
    TopAppBar(
        title = { Text(text = "Testing toolbar", color = Color.Black) },
        colors = TopAppBarDefaults.topAppBarColors(Color.Magenta)
    )
}
@Composable
fun Fab() {
    val context = LocalContext.current
    FloatingActionButton(onClick = {Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()}) {
        Text(text = "X")
    }


}
abstract class PaddingValuesProvider : PreviewParameterProvider<PaddingValues>
