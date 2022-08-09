package com.ajibsbaba.acefood_compose.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ajibsbaba.acefood_compose.components.ModelAppBar2

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun DiseaseModal() {
    Column(modifier = Modifier.fillMaxSize()) {
        ModelAppBar2()
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(text = "Tomato Disease Classes", fontWeight = FontWeight(800), fontSize = 24.sp)
            Text(text = "Types of tomato diseases that can be detected with this app", fontSize = 12.sp, fontWeight = FontWeight(400))
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, top = 24.dp)) {
            Text(text = "Mosaic Virus", fontSize = 20.sp, fontWeight = FontWeight(300))
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Early Blight", fontSize = 20.sp, fontWeight = FontWeight(300))
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Septoria Leaf Spot", fontSize = 20.sp, fontWeight = FontWeight(300))
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Bacterial Spot", fontSize = 20.sp, fontWeight = FontWeight(300))
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Target Spot", fontSize = 20.sp, fontWeight = FontWeight(300))
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Spider Mites", fontSize = 20.sp, fontWeight = FontWeight(300))
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Yellow Leaf Curl Virus", fontSize = 20.sp, fontWeight = FontWeight(300))
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Leaf Mold", fontSize = 20.sp, fontWeight = FontWeight(300))
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 48.dp),
            horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text(text = "Close", fontWeight = FontWeight(300), fontSize = 14.sp)
        }
    }


}