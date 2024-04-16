package com.kit.kitmvvm.ui.theme.screens.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Welcome() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ){
        Text(text = "WELCOME TO OUR APP",
            color = Color.White,
            fontFamily = FontFamily.Monospace,
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Fresh food for every one",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Use our app to get fresh food for " +
                "proper growth and nourishment",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
            textAlign = TextAlign.Center,

            )
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Sign in",
                fontSize = 25.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Create an account",
            color = Color.White)

    }
}

@Preview
@Composable
private fun WelcomePrev() {
    Welcome()
}