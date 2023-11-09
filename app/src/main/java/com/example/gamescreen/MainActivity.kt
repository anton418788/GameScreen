package com.example.gamescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.gamescreen.games.*
import com.example.gamescreen.screen_forms.ScreenInstall.ScreenInstall
import com.example.gamescreen.screen_forms.ScreenInstall.functions.*
import com.example.gamescreen.screen_forms.ScreenInstall.games.functions.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ApplySystemBarColors()
            //ScreenInstall(game = dota2)
            ScreenInstall(game = wow_wotlk)
            //ScreenInstall(game = cod_mw_3)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Dota_2_Test() {
    ApplySystemBarColors()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(dota2.background)
    ) {
        item {
            GamePhoto(id_photo = dota2.photo)
        }
        item {
            GameNameRate(
                game_name = dota2.name,
                game_rate = dota2.rate,
                review_count = dota2.counts,
                game_icon = dota2.icon,
                icon_size = 54
            )
        }
        item {
            GameTags(
                tags = dota2.tags
            )
        }
        item {
            GameDescription(
                game_about = dota2.about
            )
        }
        item {
            ScreenShots(
                screenshots = dota2.screenshots
            )
        }
        item {
            ReviewBox()
        }
        item {
            RateValue(game_rate = dota2.rate, review_count = dota2.counts)
        }
        itemsIndexed(dota2.critics)
        { _, item ->
            ReviewShow(review = item)
        }
        item {
            Box(modifier = Modifier.size(150.dp)) {
            }
        }
    }
    InstallButton()
}


