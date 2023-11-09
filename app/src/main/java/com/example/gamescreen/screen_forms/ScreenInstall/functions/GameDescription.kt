package com.example.gamescreen.screen_forms.ScreenInstall.games.functions

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GameDescription(game_about : String) {
    Box (
        modifier = Modifier
    ){
        Text(
            text = game_about,
            fontSize = 12.sp,
            color = Color(0xB3EEF2FB),
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.padding(start = 20.dp, top = 15.dp, end = 35.dp),
        )
    }
}


@Preview(showBackground = true,backgroundColor = 0xFF050B18)
@Composable
fun PreviewGameDescription () {
    GameDescription(game_about = "World of Warcraft: Wrath of the Lich King (colloquially known as \"WotLK\" or \"Wrath\") is the second World of Warcraft expansion and was officially announced on August 3, 2007 at BlizzCon 2007. The majority of the expansion content takes place in Northrend and centers around the plans of the Lich King. Content highlights include the increase of the level cap from 70 to 80, the introduction of the death knight Hero class, and new PvP/World PvP content. No additional playable races have been added, though many new NPC races were featured.")
}
