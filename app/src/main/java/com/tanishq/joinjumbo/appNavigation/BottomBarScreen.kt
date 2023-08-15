package com.tanishq.joinjumbo.appNavigation

import com.tanishq.joinjumbo.R


private val BottomBarRoutes = object {
    val HOME_SCREEN = "HOME_SCREEN"
    val REWARD_SCREEN = "REWARD_SCREEN"
    val JACKPOT_SCREEN = "JACKPOT_SCREEN"

}
sealed class BottomBarScreen(
    val route: String,
    val icon: Int,
    val title: String

) {
    object Home : BottomBarScreen(BottomBarRoutes.HOME_SCREEN, R.drawable.home, "Home")
    object Reward : BottomBarScreen(BottomBarRoutes.REWARD_SCREEN, R.drawable.rewards, "Reward")
    object Jackpot : BottomBarScreen(BottomBarRoutes.JACKPOT_SCREEN, R.drawable.jackpot, "Jackpot")

}
