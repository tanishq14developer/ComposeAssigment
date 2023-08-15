@file:OptIn(ExperimentalMaterial3Api::class)

package com.tanishq.joinjumbo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.tanishq.joinjumbo.appNavigation.BottomNavigationGraph
import com.tanishq.joinjumbo.screens.HomeMain
import com.tanishq.joinjumbo.screens.SplashScreen
import com.tanishq.joinjumbo.ui.theme.JoinJumboTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JoinJumboTheme {
                val navController = rememberNavController()
                BottomNavigationGraph(navController = navController)

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JoinJumboTheme {
        BottomNavigationGraph(navController = rememberNavController())
    }
}