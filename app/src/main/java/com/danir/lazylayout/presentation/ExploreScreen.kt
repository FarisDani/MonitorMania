package com.danir.lazylayout.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.danir.lazylayout.data.DummyData
import com.danir.lazylayout.model.Product
import com.danir.lazylayout.navigation.Screen
import com.danir.lazylayout.presentation.component.ProductItem
import com.danir.lazylayout.theme.LazyLayoutTheme

@Composable
fun ExploreScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    products: List<Product> = DummyData.MonitorProduct
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(products, key = { it.id}){
            ProductItem(product = it){
                productId -> navController.navigate(Screen.DetailProduct.route + "/$productId")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ExploreScreenPreview() {
    LazyLayoutTheme {
       ExploreScreen(navController = rememberNavController(), products = DummyData.MonitorProduct)
    }
}