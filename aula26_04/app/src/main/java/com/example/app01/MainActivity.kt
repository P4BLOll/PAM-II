package com.example.app01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDateRangePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSavedStateRegistryOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app01.ui.theme.App01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    register()
                }
            }
        }
    }
}

@Composable
fun register(){
    var nome  by remember{ mutableStateOf("")}
    var bairro  by remember{ mutableStateOf("")}
    var cep  by remember{ mutableStateOf("")}
    var cidade  by remember{ mutableStateOf("")}
    var estado  by remember{ mutableStateOf("")}

    Column(
        Modifier.fillMaxSize(),
    ) {

        Row(
            Modifier.fillMaxWidth()
                .padding(top = 33.dp),
            Arrangement.Center

        ) {
            Text(text = "Inserção de Dados",
                fontSize = 30.sp
            )
        }
        
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 45.dp),
        )
        
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = nome,
                onValueChange = {novoValor -> nome = novoValor},
                label = {Text("Digite seu nome:")},
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = bairro,
                onValueChange = {novoValor -> bairro = novoValor},
                label = {Text("Digite seu bairro:")},
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = cep,
                onValueChange = {novoValor -> cep = novoValor},
                label = {Text("Digite seu CEP:")},
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = cidade,
                onValueChange = {novoValor -> cidade = novoValor},
                label = {Text("Digite sua cidade:")},
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            TextField(
                value = estado,
                onValueChange = {novoValor -> estado = novoValor},
                label = {Text("Digite seu estado:")},
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ){
            Button(onClick = {},
                Modifier.height(50.dp).width(180.dp)) {
                Text(text = "Cadastrar",
                    fontSize = 20.sp)
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    App01Theme {
        Greeting("Android")
    }
}