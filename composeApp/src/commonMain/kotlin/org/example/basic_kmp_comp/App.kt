package org.example.basic_kmp_comp


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview



@Composable
@Preview
fun App() {
    MaterialTheme {

        var user by  remember { mutableStateOf("") }
        var pass by  remember { mutableStateOf("") }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically)

        ) {
            OutlinedTextField(
                value = user,
                onValueChange = {user = it}
            )
            OutlinedTextField(
                value = pass,
                onValueChange = {pass = it}
            )
            Button(
                onClick = {
                    user = ""
                    pass = ""
                },
                enabled = user.isNotEmpty() && pass.isNotEmpty()
            ){
                Text("Login")
            }
        }
    }
}



