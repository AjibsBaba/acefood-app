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
import com.ajibsbaba.acefood_compose.components.*

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun RegistrationForm() {
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
            text = "Register",
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
            FirstNameFormInput()
            Spacer(modifier = Modifier.height(8.dp))
            LastNameFormInput()
            Spacer(modifier = Modifier.height(8.dp))
            PasswordFormInput()
            Spacer(modifier = Modifier.height(8.dp))
            ConfirmPasswordFormInput()
            Column(modifier = Modifier.padding(top = 24.dp)) {
                Button(text = "Register")
                Text(
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 12.dp),
                    text = "Already have an account? Login", fontWeight = FontWeight(400),
                    fontSize = 14.sp
                )
            }
        }
    }
}