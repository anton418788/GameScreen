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
        ReviewList(R.drawable.codava1, "Petr Melnik", "April 24, 2009","Okeeey... \n" +
                "This game made me cry"),
        ReviewList(R.drawable.codava2, "Anton Shastun", "June 13, 2008","I bought the entire series of games. You don't have to look for me. Now only Captain Price can find me"),
        ReviewList(R.drawable.codava3, "Igor Redka", "December 2, 2010","I don't know what else to write. I’ll write that today the weather is good"),
        ReviewList(R.drawable.codava4, "John Snow", "September 18, 2011","You've already read three reviews... Isn't that enough?")
    ),
    _background = Color(0xFF050B18)
)


