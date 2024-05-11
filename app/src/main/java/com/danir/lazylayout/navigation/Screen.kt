package com.danir.lazylayout.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Explore : Screen("explore")
    data object About : Screen("about")
    data object DetailBrand : Screen("detail_brand")
    data object DetailStore : Screen("detail_store")
    data object DetailProduct : Screen("detail_product")
}