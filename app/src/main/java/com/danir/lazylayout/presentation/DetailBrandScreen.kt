package com.danir.lazylayout.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
//import com.android.volley.toolbox.ImageRequest
import com.danir.lazylayout.data.DummyData
import com.danir.lazylayout.model.Brand
import com.danir.lazylayout.theme.LazyLayoutTheme
import java.time.format.TextStyle

@Composable
fun DetailBrandScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    brandsId: Int?
) {
    val newBrandsList = DummyData.MonitorBrand.filter { brand -> brand.id == brandsId }
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        DetailBrandContent(newBrandsList = newBrandsList)
    }
}

@Composable
private fun DetailBrandContent(
    newBrandsList: List<Brand>,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newBrandsList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(height = 260.dp, width = 300.dp),
            contentDescription = "Merek"
        )

        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newBrandsList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newBrandsList[0].nickname})",
                style = MaterialTheme.typography.titleSmall
            )
            Text(
                text = newBrandsList[0].contact,
                style = MaterialTheme.typography.titleSmall
            )
            Column(modifier = Modifier.padding(10.dp)) {
                Text(
                    newBrandsList[0].description,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.width(300.dp)
                )
            }


        }

    }
}

@Preview(showBackground = true)
@Composable
private fun DetailBrandPrev() {
    LazyLayoutTheme {
        DetailBrandContent(newBrandsList = DummyData.MonitorBrand)
    }
}