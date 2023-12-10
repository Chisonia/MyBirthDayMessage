package com.chinenyeakukalia.mybirthdaymessage.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.chinenyeakukalia.mybirthdaymessage.R

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier ){
    val image = painterResource(R.drawable.birthday_ng)
    Box {
        Image(
            painter = image,
            modifier = Modifier.fillMaxSize(),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}