/*
package com.example.gamescreen.games

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.example.gamescreen.R
import com.example.gamescreen.functions.GameScreenshots
import com.example.gamescreen.functions.ReviewList
import com.google.accompanist.systemuicontroller.rememberSystemUiController

//VARIABLE SETTINGS::::::
const val name = "World of Warcraft: \n" + "Wrath of the Lich King"
const val photo = R.drawable.pic6303509
const val icon = R.drawable.icon_wow
const val rate = 4.4
const val counts = "70M"
val tags = listOf(
    "MMO",
    "RPG",
    "BEST GAME",
    "Time killer",
    "Windows",
    "Mac OS",
    "Keyboard only",
    "Blizzard"
)
const val about = "World of Warcraft: Wrath of the Lich King (colloquially known as \"WotLK\" or \"Wrath\") is the second World of Warcraft expansion and was officially announced on August 3, 2007 at BlizzCon 2007. The majority of the expansion content takes place in Northrend and centers around the plans of the Lich King. Content highlights include the increase of the level cap from 70 to 80, the introduction of the death knight Hero class, and new PvP/World PvP content. No additional playable races have been added, though many new NPC races were featured."
val screenshots = listOf(
    GameScreenshots(R.drawable.screenshot1),
    GameScreenshots(R.drawable.screenshot2),
    GameScreenshots(R.drawable.screenshot3),
    GameScreenshots(R.drawable.screenshot4),
    GameScreenshots(R.drawable.screenshot5),
    GameScreenshots(R.drawable.screenshot6),
)
val critics = listOf(
    ReviewList(R.drawable.human1, "Mihail Krug", "April 25, 2009","Very nice game! it's perfect! \n" +
            "I play 25 hours a day. A little more and the Lich King will give me his horse!"),
    ReviewList(R.drawable.human2, "Artemiy Lebedev", "June 2, 2008","This game will destroy your family... But you will have a level 80 warrior"),
    ReviewList(R.drawable.human3, "Egor Krid", "December 25, 2010","\"You no take candle!\" 10 cobalts out of 10!"),
    ReviewList(R.drawable.human4, "Alexandr Petrov", "September 19, 2011","You've already read three reviews... Isn't that enough?")
)
val background = Color(0xFF050B18)

@Composable
fun ApplySystemBarColors() {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(color = Color.Transparent, darkIcons = false)
        systemUiController.setNavigationBarColor(color = Color.Transparent, darkIcons = false)
    }
}*/
