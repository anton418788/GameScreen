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
    LazyColumn(   //главный экран (скролл)
        modifier = Modifier
            .fillMaxSize()
            .background(game.background).padding(bottom = 150.dp)
    ) {
        item {
            GamePhoto(id_photo = game.photo)  //главное фото игры
        }
        item {
            GameNameRate(                  //контейнер рейтинга игры с иконкой
                game_name = game.name,
                game_rate = game.rate,
                review_count = game.counts,
                game_icon = game.icon,
                icon_size = game.icon_size
            )
        }
        item {
            GameTags(              //теги игры
                tags = game.tags
            )
        }
        item {
            GameDescription(                //описание игры
                game_about = game.about
            )
        }
        item {
            ScreenShots(                       //лента скриншотов
                screenshots = game.screenshots
            )
        }
        item {
            ReviewBox()               //надпись Review & Ratings
        }
        item {
            RateValue(game_rate = game.rate, review_count = game.counts)  //рейтинг игры
        }
        itemsIndexed(game.critics)
        { _, item ->
            ReviewShow(review = item)    //отзывы критиков
        }
    }
    InstallButton()   //кнопка Install (при нажатии - Processing)
}