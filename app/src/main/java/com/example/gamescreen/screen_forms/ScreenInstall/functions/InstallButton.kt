package com.example.gamescreen.screen_forms.ScreenInstall.functions

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InstallButton () {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 70.dp),
        contentAlignment = Alignment.BottomCenter,
    ) {
        val label = remember{mutableStateOf("Install")}
        Button(
            onClick = {label.value = "Processing..."},
            modifier = Modifier
                //.offset(0.dp, 100.dp)
                .height(50.dp)
                .clip(RoundedCornerShape(16.dp))
                .width(300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFF4D144)),
            elevation = ButtonDefaults.elevation(defaultElevation = 10.dp)
        ) {
            Text(text = label.value,
                fontSize = 24.sp,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true,backgroundColor = 0xFF050B18)
@Composable
fun PreviewInstallButton () {
    InstallButton()
}