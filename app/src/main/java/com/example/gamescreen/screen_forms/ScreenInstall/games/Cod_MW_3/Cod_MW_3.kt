package com.example.gamescreen.games


import androidx.compose.ui.graphics.Color
import com.example.gamescreen.R
import com.example.gamescreen.screen_forms.ScreenInstall.functions.GameScreenshots
import com.example.gamescreen.screen_forms.ScreenInstall.functions.ReviewList
import com.example.gamescreen.screen_forms.ScreenInstall.games.Game


val cod_mw_3 = Game(
    _name = "Call of Duty:\nModern Warfare 3",
    _photo = R.drawable.cald,
    _icon = R.drawable.cod_icon,
    _icon_size = 88,
    _rate = 4.2,
    _counts = "2M",
    _tags = listOf(
        "Shooter",
        "MULTIPLAYER",
        "Call of Duty",
    ),
    _about = "Call of Duty: Modern Warfare 3 is the eighth main Call of Duty game, and the fifth developed by Infinity Ward. It's the sequel to Call of Duty: Modern Warfare 2 and is the third and final installment in the original Modern Warfare series.",
    _screenshots = listOf(
        GameScreenshots(R.drawable.cod_screen1),
        GameScreenshots(R.drawable.saba),
        GameScreenshots(R.drawable.mwiii_reveal_full_007),
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


