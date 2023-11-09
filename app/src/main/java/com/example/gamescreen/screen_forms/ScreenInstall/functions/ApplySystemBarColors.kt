package com.example.gamescreen.screen_forms.ScreenInstall.functions

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ApplySystemBarColors() {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(color = Color.Transparent, darkIcons = false)
        systemUiController.setNavigationBarColor(color = Color.Transparent, darkIcons = false)
    }
}