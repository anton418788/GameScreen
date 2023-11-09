package com.example.gamescreen.screen_forms.ScreenInstall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gamescreen.screen_forms.ScreenInstall.functions.*
import com.example.gamescreen.screen_forms.ScreenInstall.games.Game
import com.example.gamescreen.screen_forms.ScreenInstall.games.functions.*

@Composable
fun ScreenInstall (game: Game) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(game.background).padding(bottom = 150.dp)
    ) {
        item {
            GamePhoto(id_photo = game.photo)
        }
        item {
            GameNameRate(
                game_name = game.name,
                game_rate = game.rate,
                review_count = game.counts,
                game_icon = game.icon,
                icon_size = game.icon_size
            )
        }
        item {
            GameTags(
                tags = game.tags
            )
        }
        item {
            GameDescription(
                game_about = game.about
            )
        }
        item {
            ScreenShots(
                screenshots = game.screenshots
            )
        }
        item {
            ReviewBox()
        }
        item {
            RateValue(game_rate = game.rate, review_count = game.counts)
        }
        itemsIndexed(game.critics)
        { _, item ->
            ReviewShow(review = item)
        }
    }
    InstallButton()
}