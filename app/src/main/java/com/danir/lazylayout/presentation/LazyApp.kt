package com.danir.lazylayout.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.danir.lazylayout.R
import com.danir.lazylayout.navigation.NavigationItem
import com.danir.lazylayout.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LazyApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),

) {
    val titleState = remember { mutableStateOf("MonitorMania App") }
    val isBackEnabled = remember {
        mutableStateOf(false)
    }

    fun setBackIcon(icon: ImageVector){
        isBackEnabled.value = true
    }

    fun setTitle(title: String) {
        titleState.value = title
    }

    Scaffold(
        topBar = {
           TopAppBar(
               title = { Text(
               text = titleState.value,
                fontWeight = FontWeight.Bold,
               )},
               navigationIcon = {
                   if(isBackEnabled.value){
                       IconButton(onClick = { navController.navigateUp() }) {
                           Icon(
                               imageVector = Icons.Default.ArrowBackIosNew,
                               contentDescription = "Back"
                           )
                       }
                   }

               },
               colors = TopAppBarDefaults.smallTopAppBarColors(
                   containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp)

               )

           )

        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = Modifier.background(color = Color.Red)

    ) {
        contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route){
                setTitle("Home")
                HomeScreen(navController)
                isBackEnabled.value = false
            }
            composable(Screen.Explore.route){
                setTitle("Product")
                ExploreScreen(navController)
                isBackEnabled.value = false

            }

            composable(Screen.About.route){
                setTitle("About Me")
                AboutScreen()
                isBackEnabled.value = false
            }

            composable(
                Screen.DetailBrand.route + "/{brandId}",
                arguments = listOf(navArgument("brandId"){type = NavType.IntType})
            ){ navBackStackEntry ->
                DetailBrandScreen(
                    navController = navController,
                    brandsId = navBackStackEntry.arguments?.getInt("brandId"),
                )
                setTitle("Detail Brand")
                setBackIcon(Icons.Default.ArrowBackIosNew)

            }

            composable(
                Screen.DetailStore.route + "/{storeId}",
                arguments = listOf(navArgument("storeId"){type = NavType.IntType})
            ){navBackStackEntry ->
                DetailStoreScreen(
                    navController = navController,
                    storesId = navBackStackEntry.arguments?.getInt("storeId")
                    //storeid = navBackStackEntry.arguments?.getInt("storeId")
                )
                setTitle("Detail Store")
                setBackIcon(Icons.Default.ArrowBackIosNew)
            }

            composable(
                Screen.DetailProduct.route + "/{productId}",
                arguments = listOf(navArgument("productId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailProductScreen(
                    navController = navController,
                    productId = navBackStackEntry.arguments?.getInt("productId")
                )
                setTitle("Detail Product")
                setBackIcon(Icons.Default.ArrowBackIosNew)
            }

        }
    }
}


@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_explore),
                icon = Icons.Default.Search,
                screen = Screen.Explore
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_about),
                icon = Icons.Default.Person,
                screen = Screen.About
            )

        )
        navigationItems.map { item ->
            NavigationBarItem (
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route){
                        popUpTo(navController.graph.findStartDestination().id){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun LazyAppPrev() {
    LazyApp()
}