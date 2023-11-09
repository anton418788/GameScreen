package com.example.gamescreen.screen_forms.ScreenInstall.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gamescreen.R

data class GameScreenshots(
    val image_id : Int
)
@Composable
fun ScreenShots(screenshots : List<GameScreenshots>) {
    LazyRow(
        modifier = Modifier.fillMaxWidth()
    ) {
        itemsIndexed(screenshots) { _, item ->
            ScreenOpen(screenshot = item)
        }
    }
}
@Composable
private fun ScreenOpen (screenshot : GameScreenshots) {
    Box (
        modifier = Modifier
            .padding(start = 20.dp, top = 15.dp)
            .width(240.dp)
            .height(135.dp)
    ){
        Image(
            painter = painterResource(id = screenshot.image_id),
            contentDescription = "None",
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true,backgroundColor = 0xFF050B18)
@Composable
fun PreviewScreenShots () {
    ScreenShots(
        screenshots = listOf(
            GameScreenshots(R.drawable.screenshot1),
            GameScreenshots(R.drawable.screenshot2),
            GameScreenshots(R.drawable.screenshot3),
            GameScreenshots(R.drawable.screenshot4),
            GameScreenshots(R.drawable.screenshot5),
            GameScreenshots(R.drawable.screenshot6),
        )
    )
}
