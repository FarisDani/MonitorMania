package com.danir.lazylayout.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.danir.lazylayout.data.DummyData
import com.danir.lazylayout.model.Brand
import com.danir.lazylayout.model.Store
import com.danir.lazylayout.navigation.Screen
import com.danir.lazylayout.presentation.component.BrandItem
import com.danir.lazylayout.presentation.component.StoreItem


@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    brands: List<Brand> = DummyData.MonitorBrand,
    stores: List<Store> = DummyData.MonitorStore,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(0.dp),
        modifier = Modifier

    ) {
        item {
            Box(modifier = Modifier) {
                Text(
                    text = "Brands",
                    modifier = Modifier
                        .padding(start = 8.dp, top = 8.dp, end = 16.dp, bottom = 16.dp),
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(0.dp),
                modifier = modifier
            ) {
                items(brands, key = { it.id }) {
                    BrandItem(brand = it) { brandId ->
                        navController.navigate(Screen.DetailBrand.route + "/$brandId")
                    }
                }
            }
        }
        item {
            Box(modifier = Modifier) {
                Text(
                    text = "Stores",
                    modifier = Modifier
                        .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp),
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }

        items(stores, key = { it.id }) {
            StoreItem(
                store = it,
                modifier = Modifier
            ) { storeId ->
                navController.navigate(Screen.DetailStore.route + "/$storeId")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LazyAppPrev() {
    LazyApp()
}