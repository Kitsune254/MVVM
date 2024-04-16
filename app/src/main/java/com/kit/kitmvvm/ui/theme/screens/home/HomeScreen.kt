package com.kit.kitmvvm.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kit.kitmvvm.navigation.ROUTE_ABOUT

@Composable
fun Home(navController: NavHostController) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Text(text = "This is the Home Page",
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
                         navController.navigate(ROUTE_ABOUT)
        },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "About",
                color = Color.Black)
        }

    }
}

@Preview
@Composable
private fun HomePrev() {
    Home(navController = rememberNavController())
}