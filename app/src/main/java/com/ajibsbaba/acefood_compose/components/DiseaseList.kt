package com.ajibsbaba.acefood_compose.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@ExperimentalMaterial3Api
@Composable
fun DiseaseList() {
    LazyColumn(modifier = Modifier.fillMaxWidth(), contentPadding = PaddingValues(16.dp)) {
        item {
            Text(text = "Mosaic Virus", fontSize = 20.sp, fontWeight = FontWeight(300))
            Text(text = "Early Blight", fontSize = 20.sp, fontWeight = FontWeight(300))
            Text(text = "Septoria Leaf Spot", fontSize = 20.sp, fontWeight = FontWeight(300))
            Text(text = "Bacterial Spot", fontSize = 20.sp, fontWeight = FontWeight(300))
            Text(text = "Target Spot", fontSize = 20.sp, fontWeight = FontWeight(300))
            Text(text = "Spider Mites", fontSize = 20.sp, fontWeight = FontWeight(300))
            Text(text = "Yellow Leaf Curl Virus", fontSize = 20.sp, fontWeight = FontWeight(300))
            Text(text = "Leaf Mold", fontSize = 20.sp, fontWeight = FontWeight(300))
        }
    }
}