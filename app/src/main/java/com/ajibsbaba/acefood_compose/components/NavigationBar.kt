package com.ajibsbaba.acefood_compose.components


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ajibsbaba.acefood_compose.ui.theme.Pink
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.*




@Preview
@Composable
fun NavBar() {
    var selectedItem: Int by remember { mutableStateOf(0) }
    val items = listOf("Home", "Profile")


    NavigationBar(
        contentColor = Color.Black, containerColor = Pink
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Home, contentDescription = null) },
                label = { Text(item) },
                selected = selectedItem == index, onClick = { selectedItem = index })
        }
    }
}