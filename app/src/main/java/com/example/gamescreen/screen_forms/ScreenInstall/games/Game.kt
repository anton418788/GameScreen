package com.example.gamescreen.screen_forms.ScreenInstall.games

import androidx.compose.ui.graphics.Color
import com.example.gamescreen.screen_forms.ScreenInstall.functions.GameScreenshots
import com.example.gamescreen.screen_forms.ScreenInstall.functions.ReviewList

class Game (
    _name : String,   //Название игры
    _photo : Int,     //Главное фото игры (сверху)
    _icon : Int,     //Иконка игры (квадратная)
    _icon_size : Int,  //Размер иконки
    _rate : Double,  //рейтинг игры
    _counts : String,  //кол-во скачиваний (строка)
    _tags : List<String>,   //теги игры
    _about : String,  //описание игры
    _screenshots : List<GameScreenshots>,  //лента скриншотов
    _critics : List<ReviewList>,  //обзоры
    _background : Color   //цвет общего фона
){
    val name = _name
    val photo = _photo
    val icon = _icon
    val icon_size = _icon_size //1-88
    val rate = _rate
    val counts = _counts
    val tags = _tags
    val about = _about
    val screenshots = _screenshots
    val critics = _critics
    val background = _background
}