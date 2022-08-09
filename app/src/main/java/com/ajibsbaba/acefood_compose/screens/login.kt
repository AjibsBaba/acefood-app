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
import com.ajibsbaba.acefood_compose.components.Button
import com.ajibsbaba.acefood_compose.components.EmailFormInput
import com.ajibsbaba.acefood_compose.components.ModelAppBar
import com.ajibsbaba.acefood_compose.components.PasswordFormInput

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun LoginForm() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(2.dp),
    ) {
        ModelAppBar()
        Text(
            modifier = Modifier
                .padding(top = 24.dp, bottom = 24.dp)
                .align(alignment = Alignment.CenterHorizontally),
            text = "Login",
            fontWeight = FontWeight(800),
            fontSize = 32.sp
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp, end = 12.dp, bottom = 24.dp)
        ) {
            EmailFormInput()
            Spacer(modifier = Modifier.height(8.dp))
            PasswordFormInput()
            Column(modifier = Modifier.padding(top = 24.dp)) {
                Button()
                Text(
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 12.dp),
                    text = "Did you forget your password? Reset", fontWeight = FontWeight(400),
                    fontSize = 14.sp
                )
            }
        }
    }
}