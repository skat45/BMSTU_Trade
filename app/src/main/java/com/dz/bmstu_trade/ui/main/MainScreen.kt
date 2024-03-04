package com.dz.bmstu_trade.ui.main

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dz.bmstu_trade.navigation.BottomNavigationBar
import com.dz.bmstu_trade.navigation.MainNavHost


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(outerNavController: NavHostController) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) {innerPadding ->
        MainNavHost(navController, innerPadding)
    }
}