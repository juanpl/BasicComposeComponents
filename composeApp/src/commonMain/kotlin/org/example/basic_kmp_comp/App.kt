package org.example.basic_kmp_comp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import basiccomposecomponents.composeapp.generated.resources.Res
import basiccomposecomponents.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .statusBarsPadding()
                .background(Color.Yellow)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ){
            MyButton("Click me", modifier = Modifier.weight(1f))
            MyButton("Click me too", modifier = Modifier.weight(1f))
            MyButton("Click me again!!", modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun MyButton(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
            .clickable { println("Clicked") }
            .background(Color.Magenta, shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 16.dp, vertical = 8.dp)

    )
}