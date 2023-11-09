package com.example.gamescreen.screen_forms.ScreenInstall.games

import androidx.compose.ui.graphics.Color
import com.example.gamescreen.screen_forms.ScreenInstall.functions.GameScreenshots
import com.example.gamescreen.screen_forms.ScreenInstall.functions.ReviewList

class Game (
    _name : String,
    _photo : Int,
    _icon : Int,
    _icon_size : Int,
    _rate : Double,
    _counts : String,
    _tags : List<String>,
    _about : String,
    _screenshots : List<GameScreenshots>,
    _critics : List<ReviewList>,
    _background : Color
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