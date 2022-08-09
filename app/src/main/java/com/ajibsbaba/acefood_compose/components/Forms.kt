package com.ajibsbaba.acefood_compose.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue

@ExperimentalMaterial3Api
@Composable
fun EmailFormInput() {
    var theEmail by remember {
        mutableStateOf(TextFieldValue(""))
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = theEmail,
        label = {
            Text(text = "Email Address")
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        onValueChange = {
            theEmail = it
        })
}

@ExperimentalMaterial3Api
@Composable
fun FirstNameFormInput() {
    var theFname by remember {
        mutableStateOf(TextFieldValue(""))
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = theFname,
        label = {
            Text(text = "Firstname")
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        onValueChange = {
            theFname = it
        })
}

@ExperimentalMaterial3Api
@Composable
fun LastNameFormInput() {
    var theLname by remember {
        mutableStateOf(TextFieldValue(""))
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = theLname,
        label = {
            Text(text = "Lastname")
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        onValueChange = {
            theLname = it
        })
}

@ExperimentalMaterial3Api
@Composable
fun PasswordFormInput() {
    var thePassword by remember {
        mutableStateOf(TextFieldValue(""))
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = thePassword,
        label = {
            Text(text = "Password")
        },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        onValueChange = {
            thePassword = it
        })
}

@ExperimentalMaterial3Api
@Composable
fun ConfirmPasswordFormInput() {
    var thePassword by remember {
        mutableStateOf(TextFieldValue(""))
    }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = thePassword,
        label = {
            Text(text = "Confirm Password")
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        onValueChange = {
            thePassword = it
        })
}

