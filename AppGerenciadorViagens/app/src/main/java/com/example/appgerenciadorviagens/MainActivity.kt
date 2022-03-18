package com.example.appgerenciadorviagens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appgerenciadorviagens.ui.theme.AppGerenciadorViagensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppGerenciadorViagensTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Login()
}

@Composable
fun Login() {
    Card(
        elevation = 10.dp,
        modifier = Modifier
            .padding(all = 8.dp)
            .fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(all = 25.dp)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.travelicon),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(start = 8.dp)
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(all = 25.dp)
                    .fillMaxSize()
            ) {
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = { },
                    label = { Text("Usuário") },
                )
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = "",
                    onValueChange = { },
                    label = { Text("Senha") },
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "Esqueci a senha")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    //Text(text = "  |  ")
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "Cadastrar-se")
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Entrar")
                }

            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppGerenciadorViagensTheme {
        App()
    }
}