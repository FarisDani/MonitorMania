package com.danir.lazylayout.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.danir.lazylayout.presentation.component.AbouiItem
import com.danir.lazylayout.theme.LazyLayoutTheme

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        AbouiItem()
    }

}

@Preview(showBackground = true)
@Composable
private fun AboutScreenPreview() {
    LazyLayoutTheme {
        AboutScreen()
    }

}