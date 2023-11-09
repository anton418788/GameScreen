package com.example.gamescreen.screen_forms.ScreenInstall.functions

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun GameTags (tags : List<String>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.padding(start = 20.dp)
    ) {
        itemsIndexed(tags)
        { _, item ->
            TagOpen(item)
        }
    }
}
@Composable
private fun TagOpen (tag : String) {
    Box (
        modifier = Modifier
            .clip(shape = RoundedCornerShape(100.dp))
            .background(Color(0x2444A9F4))
            .padding(10.dp, 5.dp)
    ){
        Text(
            text = tag,
            color = Color(0xFF41A0E7),
            fontSize = 10.sp,
        )
    }
}

@Preview(showBackground = true,backgroundColor = 0xFF050B18)
@Composable
fun PreviewGameTags () {
    GameTags(
        tags = listOf(
            "MMO",
            "RPG",
            "BEST GAME",
            "Time killer",
            "Windows",
            "Mac OS",
            "Keyboard only",
            "Blizzard"
        )
    )
}