package com.example.musicapp

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {

    sealed class BottomScreen(
        val bTitle:String,
        val bRoute:String,
        @DrawableRes val icon:Int
    ): Screen(bTitle,bRoute) {
        object Home: BottomScreen(
            bTitle = "Home",
            bRoute = "home",
            icon = R.drawable.baseline_home_24
        )
        object Browse: BottomScreen(
            bTitle = "Browse",
            bRoute = "browse",
            icon = R.drawable.baseline_search_24
        )
        object Library: BottomScreen(
            bTitle = "Library",
            bRoute = "library",
            icon = R.drawable.baseline_library_music_24
        )
    }


    sealed class DrawerScreen(
        val dTitle:String,
        val dRoute:String,
        @DrawableRes val icon:Int
    ):Screen(dTitle,dRoute){
        object Account: DrawerScreen(
            dTitle = "Account",
            dRoute = "account",
            icon = R.drawable.baseline_account_box_24
        )
        object Subscription: DrawerScreen(
            dTitle = "Subscription",
            dRoute = "subscription",
            icon = R.drawable.baseline_library_music_24
        )
        object AddAccount: DrawerScreen(
            dTitle = "Add Account",
            dRoute = "add_account",
            icon = R.drawable.baseline_person_add_alt_1_24
        )
    }
}

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)

val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)