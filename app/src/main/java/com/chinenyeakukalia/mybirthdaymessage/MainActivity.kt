package com.chinenyeakukalia.mybirthdaymessage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.chinenyeakukalia.mybirthdaymessage.ui.theme.GreetingImage
import com.chinenyeakukalia.mybirthdaymessage.ui.theme.MyBirthDayMessageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBirthDayMessageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = getString(R.string.happy_birthday_text), from = getString(
                        R.string.signature_text
                    ))
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyBirthDayMessageTheme {
        GreetingImage(
            stringResource(R.string.happy_birthday_text),
            stringResource(R.string.signature_text),
            modifier = Modifier
        )
    }
}