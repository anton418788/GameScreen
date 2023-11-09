package com.example.gamescreen.screen_forms.ScreenInstall.functions

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
fun ReviewBox () {
    Box () {
        Text(
            text = "Review & Ratings",
            fontSize = 16.sp,
            color = Color.White,
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.padding(start = 20.dp, top = 15.dp, end = 35.dp)
        )
    }
}

@Preview(showBackground = true,backgroundColor = 0xFF050B18)
@Composable
fun PreviewReviewBox () {
    ReviewBox()
}