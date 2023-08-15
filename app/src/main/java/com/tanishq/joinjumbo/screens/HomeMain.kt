package com.tanishq.joinjumbo.screens


import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.Icon

import androidx.navigation.NavDestination
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

import com.tanishq.joinjumbo.appNavigation.BottomBarScreen
import com.tanishq.joinjumbo.appNavigation.BottomNavigationGraph


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun HomeMain() {

    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            BottomNavigationGraph(navController = navController)
        }

    }
}

@Composable
fun BottomBar(navController: NavHostController) {

    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Reward,
        BottomBarScreen.Jackpot
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination
    Log.e("not", "BottomBar: $currentRoute", )
    NavigationBar {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentRoute = currentRoute,
                navController = navController
            )

        }
    }


}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentRoute: NavDestination?,
    navController: NavHostController
) {
    NavigationBarItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                painter = painterResource(id = screen.icon),
                contentDescription = "Navigation Icon"
            )
        },
        selected = currentRoute?.parent?.any { it.route == screen.route } == true,

        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }
    )

}

