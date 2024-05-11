package com.danir.lazylayout.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.danir.lazylayout.data.DummyData
import com.danir.lazylayout.model.Product
import com.danir.lazylayout.theme.LazyLayoutTheme

@Composable
fun DetailProductScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    productId: Int?
    ) {
        val newProductList = DummyData.MonitorProduct.filter { product ->
            product.id == productId
        }
        Column(modifier = modifier) {
            DetailProductContent(newProductList = newProductList)
        }
}

@Composable
private fun DetailProductContent(
    newProductList: List<Product>,
    modifier: Modifier = Modifier) 
    {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(data = newProductList[0].photo)
                    .build(),
                modifier = Modifier
                    .size(height = 350.dp, width = 270.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentDescription = "Monitor"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(8.dp)
                ) {
                Text(
                    text = newProductList[0].name,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(16.dp)

                )
                Text(
                    text = newProductList[0].price,
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(16.dp)
                )
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(
                        newProductList[0].specs,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier.width(300.dp)
                    )
                }
            }
        }
}

@Preview(showBackground = true)
@Composable
private fun DetailProductContentPrev() {
    LazyLayoutTheme {
        DetailProductContent(newProductList = DummyData.MonitorProduct)
    }
}