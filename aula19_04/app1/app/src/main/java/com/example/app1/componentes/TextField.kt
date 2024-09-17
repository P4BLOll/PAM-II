package com.example.app1.componentes

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable

fun simpleTextField() {

    var text by remember { mutableStateOf("") }

    TextField(value = text, onValueChange = {}, label = { Text(text = "Nome") })

    TextField(value = text, onValueChange = {novoValor -> text = novoValor},
        label = { Text(text = "Nome") })

}