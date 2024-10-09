package org.example.project

import MathUtils
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val mathUtils = MathUtils()
    LaunchedEffect(Unit) {
        println("add 1 + 2 = ${mathUtils.add(1, 2)}")
    }
}