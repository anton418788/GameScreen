package com.example.gamescreen.screen_forms.ScreenInstall.functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamescreen.R

data class ReviewList(
    val avatar_id : Int,
    val name_profile : String,
    val review_date : String,
    val review_desc : String
)
@Composable
fun ReviewShow (review : ReviewList) {
    Column(modifier = Modifier.padding(start = 20.dp, top = 25.dp)) {
        Row() {
            Image(painter = painterResource(
                id = review.avatar_id),
                contentDescription = "None",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .width(36.dp)
                    .height(36.dp)
            )
            Column(modifier = Modifier.padding(start = 18.dp)) {
                Text(
                    text = review.name_profile,
                    fontSize = 16.sp,
                    color = Color.White,
                    style = MaterialTheme.typography.subtitle2,
                )
                Text(
                    text = review.review_date,
                    fontSize = 12.sp,
                    color = Color(0xB3EEF2FB),
                    style = MaterialTheme.typography.subtitle2,
                )
            }
        }
        Box(modifier = Modifier.padding(top = 10.dp, end = 10.dp)) {
            Text(
                text = review.review_desc,
                fontSize = 12.sp,
                color = Color(0xB3EEF2FB),
                style = MaterialTheme.typography.subtitle2,
            )
        }
        Divider (
            color = Color(0xFF1A1F29),
            thickness = 1.dp,
            modifier = Modifier.padding(
                top = 25.dp, start = 15.dp, end = 15.dp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewReviewList () {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF050B18))
    ) {
        itemsIndexed(listOf(
            ReviewList(
                R.drawable.human1, "Mihail Krug", "April 25, 2009","Very nice game! it's perfect! \n" +
                    "I play 25 hours a day. A little more and the Lich King will give me his horse!"),
            ReviewList(R.drawable.human2, "Artemiy Lebedev", "June 2, 2008","This game will destroy your family... But you will have a level 80 warrior"),
            ReviewList(R.drawable.human3, "Egor Krid", "December 25, 2010","\"You no take candle!\" 10 cobalts out of 10!"),
            ReviewList(R.drawable.human4, "Alexandr Petrov", "September 19, 2011","You've already read three reviews... Isn't that enough?")
        ))
        { _, item ->
            ReviewShow(review = item)
        }
        item {
            Box(modifier = Modifier.size(150.dp)) {
            }
        }
    }
}
