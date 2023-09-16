package com.example.taptochangeimage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taptochangeimage.ui.theme.TapToChangeImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TapToChangeImageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeApp()
                }
            }
        }
    }
}

@Composable
fun LemonApp() {
    var currentStep by remember{ mutableStateOf(1) }
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when(currentStep){
            1 -> {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_tree),
                        contentDescription = "Lemon Tree",
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { currentStep = 2 }

                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    Text(text = stringResource(id = R.string.lemon_tree))
                }
            }

            2 -> {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_squeeze),
                        contentDescription = "Squeze the Lemon",
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { currentStep = 3 }

                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    Text(text = stringResource(id = R.string.lemon))
                }
            }

            3 -> {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_drink),
                        contentDescription = "Drink the Lemonade",
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { currentStep = 4 }

                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    Text(text = stringResource(id = R.string.lemonade))
                }
            }

            4 -> {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.lemon_restart),
                        contentDescription = "Restart the process",
                        modifier = Modifier
                            .wrapContentSize()
                            .clickable { currentStep = 1 }
                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    Text(text = stringResource(id = R.string.empty_glass))
                }
            }
        }

    }

}
@Preview(showBackground = true)
@Composable
fun LemonadeApp() {
    LemonApp()
}