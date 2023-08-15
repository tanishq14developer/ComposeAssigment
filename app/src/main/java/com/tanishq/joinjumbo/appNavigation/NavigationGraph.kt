package com.tanishq.joinjumbo.appNavigation

import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tanishq.joinjumbo.screens.HomeMain
import com.tanishq.joinjumbo.screens.HomeScreen
import com.tanishq.joinjumbo.screens.JackpotScreen
import com.tanishq.joinjumbo.screens.RewardsScreen
import com.tanishq.joinjumbo.screens.SplashScreen
import com.tanishq.joinjumbo.screens.StartScreen

private val CommonScreens = object {
    val SPLASH_SCREEN = "SPLASH_SCREEN"
    val ONBOARDING_SCREEN = "ONBOARDING_SCREEN"
    val HOME_MAIN  = "HOME_MAIN"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigationGraph(navController: NavHostController){

    val navigateToSplash = fun(){
        navController.navigate(CommonScreens.ONBOARDING_SCREEN)
    }
    val navigateToHomeScreen = fun(){
        navController.navigate(CommonScreens.HOME_MAIN)
    }

    NavHost(navController = navController, startDestination = CommonScreens.SPLASH_SCREEN){

        splashScreen {
            navigateToSplash()
        }
        onboardingScreen{
          navigateToHomeScreen()
        }

        composable(route = CommonScreens.HOME_MAIN){
            HomeMain()
        }

        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }

        composable(route = BottomBarScreen.Reward.route){
          RewardsScreen()
        }
        composable(route = BottomBarScreen.Jackpot.route){
         JackpotScreen()
        }

    }
}

fun NavGraphBuilder.splashScreen(navigateToSplash: () -> Unit) {
    composable(route = CommonScreens.SPLASH_SCREEN) {
        SplashScreen(navigateToSplash)

    }
}

fun NavGraphBuilder.onboardingScreen(navigateToHomeScreen: () -> Unit) {
    composable(route = CommonScreens.ONBOARDING_SCREEN) {
        StartScreen(navigateToHomeScreen)
    }
}

