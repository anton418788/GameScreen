package com.example.gamescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.gamescreen.games.*
import com.example.gamescreen.screen_forms.ScreenInstall.ScreenInstall
import com.example.gamescreen.screen_forms.ScreenInstall.functions.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ApplySystemBarColors()
            //ScreenInstall(game = dota2)
            //ScreenInstall(game = wow_wotlk)
            ScreenInstall(game = cod_mw_3)
        }
    }
}





