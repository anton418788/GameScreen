package com.example.gamescreen.screen_forms.ScreenInstall.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gamescreen.R

@Composable
fun GamePhoto(id_photo : Int) {
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
    ){
        Image(
            painter = painterResource(id = id_photo),
            contentDescription = "null",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true,backgroundColor = 0xFF050B18)
@Composable
fun PreviewGamePhoto () {
    GamePhoto(id_photo = R.drawable.pic6303509)
}