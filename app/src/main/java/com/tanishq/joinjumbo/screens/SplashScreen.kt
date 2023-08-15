package com.tanishq.joinjumbo.screens

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.tanishq.joinjumbo.R
import com.tanishq.joinjumbo.ui.theme.LightGreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun SplashScreen(navigateSplashScreenToOnboarding: () -> Unit){

    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(key1 = Unit) {
        coroutineScope.launch {
            delay(5000) // Delay for 5 seconds
            navigateSplashScreenToOnboarding()
        }
    }



    Surface(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = LightGreen),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){

            Image(
                painter = painterResource(id = R.drawable.jumbo),
                contentDescription = "jumbo logo"

            )

        }

    }



}

@Preview
    (device = Devices.NEXUS_5, showBackground = true)
@Composable
fun DefaultPreviewOfSplashScreen() {
    SplashScreen(navigateSplashScreenToOnboarding = {})

}
