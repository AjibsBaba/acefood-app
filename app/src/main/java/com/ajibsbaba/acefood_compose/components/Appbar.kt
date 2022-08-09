package com.ajibsbaba.acefood_compose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ajibsbaba.acefood_compose.R

@Preview
@ExperimentalMaterial3Api
@Composable
fun ModelAppBar2() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CenterAlignedTopAppBar(
            {
                Image(
                    painter = painterResource(R.drawable.logo_mixed_variant),
                    contentDescription = null
                )
            },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.Close, contentDescription = null
                    )
                }
            }
        )
    }
}

@Preview
@ExperimentalMaterial3Api
@Composable
fun TopAppBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    )
    {
        SmallTopAppBar(
            {
                Image(
                    painter = painterResource(R.drawable.wordmark_mixed),
                    contentDescription = "Acefood Brand"
                )
            }
        )
    }
}

@Preview
@Composable
@ExperimentalMaterial3Api
fun TextAppBar() {
    Column(modifier = Modifier.fillMaxWidth()) {
        SmallTopAppBar(
            title = { Text(text = "Account Info", fontWeight = FontWeight(800)) },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.ArrowBack, contentDescription = null
                    )
                }
            }
        )
    }
}

@Preview
@Composable
@ExperimentalMaterial3Api
fun ModelAppBar() {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        CenterAlignedTopAppBar(
            {
                Image(
                    painter = painterResource(R.drawable.logo_mixed_variant),
                    contentDescription = null
                )
            },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Outlined.ArrowBack, contentDescription = null
                    )
                }
            }
        )
    }
}