package com.ajibsbaba.acefood_compose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ajibsbaba.acefood_compose.R
import com.ajibsbaba.acefood_compose.components.NavBar
import com.ajibsbaba.acefood_compose.components.TopAppBar
import com.ajibsbaba.acefood_compose.ui.theme.KindaWhite
import com.ajibsbaba.acefood_compose.ui.theme.Red
import com.ajibsbaba.acefood_compose.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { TopAppBar() },
        bottomBar = { NavBar() },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues = PaddingValues(16.dp))
                    .fillMaxSize()
            ) {
                Spacer(modifier = Modifier.height(48.dp))
                AuthenticatedUser()
                Spacer(modifier = Modifier.height(16.dp))
                StartScan()
                Spacer(modifier = Modifier.height(16.dp))
                ActionSections()
                Spacer(modifier = Modifier.height(16.dp))
                RecentScans()
            }
        },
    )
}


@Composable
fun StartScan() {
    Card(
        modifier = Modifier
            .width(396.dp)
            .height(70.dp),
        colors = CardDefaults.cardColors(containerColor = Red, contentColor = White)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(
                    R.drawable.white_circle
                ),
                contentDescription = "White Circle",
                modifier = Modifier.padding(end = 14.dp)
            )
            Column {
                Text(
                    text = "Start a disease scan",
                    fontSize = 16.sp,
                    color = White,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Save your plants today!",
                    fontSize = 10.sp,
                    color = White,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}


@Composable
fun AuthenticatedUser() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Hello \n" +
                        "Samuel", fontWeight = FontWeight.ExtraBold, fontSize = 32.sp
            )
            Text(text = "hello@ajibsbaba.com", fontWeight = FontWeight.Normal, fontSize = 12.sp)
        }
        Image(painter = painterResource(R.drawable.white_circle), contentDescription = null)

    }
}


@Composable
fun ActionSections() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            modifier = Modifier
                .height(200.dp)
                .width(190.dp),
            shape = RoundedCornerShape(corner = CornerSize(14.dp)),
            colors = CardDefaults.cardColors(
                containerColor = KindaWhite,
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Explore Types of Diseases",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 20.dp, top = 56.dp, end = 20.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Card(
            modifier = Modifier
                .height(200.dp)
                .width(190.dp),
            shape = RoundedCornerShape(corner = CornerSize(14.dp)),
            colors = CardDefaults.cardColors(
                containerColor = KindaWhite,
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Submit Disease Photos",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 20.dp, top = 56.dp, end = 20.dp)
            )
        }
    }
}


@Composable
fun RecentScans() {
    Column() {
        Text(text = "Recent Scans", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.padding()) {
            Card(
                shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    Row() {
                        Image(
                            painter = painterResource(R.drawable.white_circle),
                            contentDescription = "TODO"
                        )
                        Spacer(modifier = Modifier.width(24.dp))
                        Column() {
                            Text(
                                text = "Tomato",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "Late Blight",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Light
                            )
                        }
                    }
                    Column() {
                        Text(text = "73%", fontWeight = FontWeight.Light, fontSize = 12.sp)
                        Text(text = "Accuracy", fontWeight = FontWeight.Light, fontSize = 12.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier = Modifier.padding()) {
            Card(
                shape = RoundedCornerShape(corner = CornerSize(10.dp)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    Row() {
                        Image(
                            painter = painterResource(R.drawable.white_circle),
                            contentDescription = "TODO"
                        )
                        Spacer(modifier = Modifier.width(24.dp))
                        Column() {
                            Text(
                                text = "Tomato",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 16.sp
                            )
                            Text(text = "Healthy", fontSize = 12.sp, fontWeight = FontWeight.Light)
                        }
                    }
                    Column() {
                        Text(text = "84%", fontWeight = FontWeight.Light, fontSize = 12.sp)
                        Text(text = "Accuracy", fontWeight = FontWeight.Light, fontSize = 12.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

        }
    }
}