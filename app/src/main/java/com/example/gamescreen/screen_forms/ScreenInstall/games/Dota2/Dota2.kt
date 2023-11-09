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
        ReviewList(R.drawable.human1, "Mihail Krug", "April 25, 2009","Very nice game! it's perfect! \n" +
                "I play 25 hours a day. A little more and the Lich King will give me his horse!"),
        ReviewList(R.drawable.human2, "Artemiy Lebedev", "June 2, 2008","This game will destroy your family... But you will have a level 80 warrior"),
        ReviewList(R.drawable.human3, "Egor Krid", "December 25, 2010","\"You no take candle!\" 10 cobalts out of 10!"),
        ReviewList(R.drawable.human4, "Alexandr Petrov", "September 19, 2011","You've already read three reviews... Isn't that enough?")
    ),
    _background = Color(0xFF050B18)
)


