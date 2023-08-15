package com.tanishq.joinjumbo.screens

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tanishq.joinjumbo.R
import com.tanishq.joinjumbo.ui.theme.DarkGreen
import com.tanishq.joinjumbo.ui.theme.DarkestGreen
import com.tanishq.joinjumbo.ui.theme.LightGreen

@Composable
fun StartScreen(navigateToHomeScreen : () -> Unit){

    val termsAndPrivacyText = buildAnnotatedString {
        append("By continuing you agree to our ")
        withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
            append("Terms of Use")
        }
        append(" and ")
        withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
            append("Privacy Policy")
        }

    }

    Surface(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn()
                    .padding(top = 18.dp)
            ){
                Text(text = "Jumbo", modifier = Modifier
                        .padding(start = 10.dp)
                        .fillMaxWidth()
                        .heightIn(),
                    style = TextStyle.Default.merge(TextStyle(textAlign = TextAlign.Center, fontSize = 24.sp)),
                    color = DarkGreen,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Bharat ka sabse rewarding shopping \napp ✨",
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
                    .fillMaxWidth()
                    .heightIn()
                    .padding(start = 10.dp)
                ,
                style = TextStyle.Default.merge(TextStyle(textAlign = TextAlign.Start, fontSize = 28.sp, fontWeight = FontWeight.Bold)),
                color = DarkestGreen
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = termsAndPrivacyText,
                modifier = Modifier
                    .padding(start = 10.dp, end = 20.dp)
                    .fillMaxWidth()
                    .heightIn()
                    .padding(start = 10.dp),
                style = TextStyle.Default.merge(TextStyle(textAlign = TextAlign.Center, fontSize = 12.sp)),
                color = DarkestGreen
            )
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = LightGreen),
                onClick = {navigateToHomeScreen() }
            ) {
                Text(
                    text = "Shuru Karein",
                    modifier = Modifier.padding(horizontal = 30.dp, vertical = 6.dp),
                    style =  TextStyle.Default.merge(TextStyle(textAlign = TextAlign.Center, fontSize = 16.sp, fontWeight = FontWeight.Bold, color =  DarkestGreen))
                )
                
            }
        }
    }

}


@Preview(device = Devices.NEXUS_5, showBackground = true)
@Composable
fun DefaultPreviewOfStartScreen() {
    StartScreen(navigateToHomeScreen = {})

}

