package com.example.gamescreen.screen_forms.ScreenInstall.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.roundToInt
import com.example.gamescreen.R


@Composable
fun RateValue (game_rate : Double, review_count : String) {
    Row (
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.padding(start = 20.dp, top = 10.dp, )
    )
    {
        Box(contentAlignment = Alignment.BottomStart) {
            Text(
                text = game_rate.toString(),
                color = Color.White,
                style = MaterialTheme.typography.subtitle2,
                fontSize = 48.sp,
                modifier = Modifier.offset(0.dp, 10.dp)
            )
        }
        Column (modifier = Modifier.padding(start = 5.dp)){
            Row (){
                StarElem(4.3, 12)
            }
            Text(text = "$review_count Reviews",
                color = Color(0xB3EEF2FB),
                style = MaterialTheme.typography.subtitle2,
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 2.dp),
                textAlign = TextAlign.Start
            )
        }
    }
}
@Composable
fun StarElem (rate : Double, size_star : Int) {
    var i = 0
    while (i < (rate.roundToInt())) {
        Image(
            painter = painterResource(id = R.drawable.star_1),
            contentDescription ="None",
            modifier = Modifier
                .size(size_star.dp)
                .padding(start = 2.dp)
        )
        i++
    }
}

@Preview(showBackground = true,backgroundColor = 0xFF050B18)
@Composable
fun PreviewRateValue () {
    RateValue(game_rate = 4.4, review_count = "70M")
}