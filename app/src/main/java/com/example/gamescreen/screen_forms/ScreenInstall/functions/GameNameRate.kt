package com.example.gamescreen.screen_forms.ScreenInstall.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamescreen.R

@Composable
fun GameNameRate(game_name : String, game_rate : Double, review_count : String, game_icon : Int, icon_size: Int) {
    Row (
        modifier = Modifier.offset(20.dp, (-30).dp),
        verticalAlignment = Alignment.Bottom
    ){
        Box (
            modifier = Modifier
                .border(1.dp, Color.DarkGray, shape = RoundedCornerShape(16.dp))
                .size(88.dp)
                .background(color = Color.Black, shape = RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center
        ){
            GameLogo(logo_id = game_icon, icon_size = icon_size)
        }
        Box (contentAlignment = Alignment.CenterStart, modifier = Modifier.height(100.dp)){
            Column (modifier = Modifier.padding(start = 10.dp)){
                Box(modifier = Modifier.height(30.dp)){}
                Box{
                    Text(
                        text = game_name,
                        color = Color.White,
                        style = MaterialTheme.typography.subtitle2,
                        fontSize = 20.sp,
                        maxLines = 2
                    )
                }
                Row (verticalAlignment = Alignment.Bottom){
                    StarElem(game_rate , 12)
                    Text(text = review_count,
                        color = Color(0xB3EEF2FB),
                        style = MaterialTheme.typography.subtitle2,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(start = 10.dp),
                    )
                }
            }
        }
    }
}
@Composable
private fun GameLogo(logo_id : Int, icon_size : Int) {
    Image(
        painter = painterResource(id = logo_id),
        contentDescription = "null",
        modifier = Modifier
            .size(icon_size.dp),   ///убрать, чтобы иконка растянулась на весь бокс
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true,backgroundColor = 0xFF050B18)
@Composable
fun PreviewGameNameRate () {
    GameNameRate(game_name = "World of Warcraft: \n" + "Wrath of the Lich King", game_rate = 4.4, review_count = "70M", game_icon = R.drawable.icon_wow, 54)
}
