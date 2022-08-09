package com.ajibsbaba.acefood_compose.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ajibsbaba.acefood_compose.ui.theme.Red
import com.ajibsbaba.acefood_compose.ui.theme.White

@Preview
@Composable
fun Button(text: String = "Login") {
    androidx.compose.material3.Button(
        onClick = { /* ... */ },
        colors = ButtonDefaults.textButtonColors(Red),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
    ) {
        Text(text = text, fontSize = 14.sp, fontWeight = FontWeight(800), color = White)
    }
}

@Preview
@Composable
fun OtherButton() {
    androidx.compose.material3.Button(
        onClick = { /* ... */ },
        colors = ButtonDefaults.textButtonColors(White),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
    ) {
        Text(text = "Detect", fontSize = 14.sp, fontWeight = FontWeight(800), color = Red)
    }
}

