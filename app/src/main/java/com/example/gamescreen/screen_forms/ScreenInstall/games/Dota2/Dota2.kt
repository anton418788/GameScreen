package com.example.gamescreen.games


import androidx.compose.ui.graphics.Color
import com.example.gamescreen.R
import com.example.gamescreen.screen_forms.ScreenInstall.functions.GameScreenshots
import com.example.gamescreen.screen_forms.ScreenInstall.functions.ReviewList
import com.example.gamescreen.screen_forms.ScreenInstall.games.Game


val dota2 = Game(
    _name = "DoTA 2",
    _photo = R.drawable.image_16,
    _icon = R.drawable.image_17,
    _icon_size = 54,
    _rate = 4.9,
    _counts = "70M",
    _tags = listOf(
        "MOBA",
        "MULTIPLAYER",
        "STRATEGY",
    ),
    _about = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
    _screenshots = listOf(
        GameScreenshots(R.drawable.image_18),
        GameScreenshots(R.drawable.card02),
        GameScreenshots(R.drawable.screenshot3),
        GameScreenshots(R.drawable.screenshot4),
        GameScreenshots(R.drawable.screenshot5),
        GameScreenshots(R.drawable.screenshot6),
    ),
    _critics = listOf(
        ReviewList(R.drawable.dotaava1, "Alex Rade", "April 25, 2009","Why did I download this game? \n" +
                "In 5 minutes of playing I heard more insults than in my entire life"),
        ReviewList(R.drawable.dotaava2, "Sergey Karandash", "June 2, 2008","Where is our pig at the top five?..."),
        ReviewList(R.drawable.dotaava3, "Robert Kchau", "December 25, 2010","I've never played Dota. I don’t know what else to write here)"),
        ReviewList(R.drawable.dotaava4, "Artem Makov", "September 19, 2011","You've already read three reviews... Isn't that enough?")
    ),
    _background = Color(0xFF050B18)
)


