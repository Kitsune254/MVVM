package com.kit.kitmvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kit.kitmvvm.ui.theme.screens.about.About
import com.kit.kitmvvm.ui.theme.screens.home.Home
import com.kit.kitmvvm.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
    NavHost(navController = navController,
        modifier=modifier,
        startDestination = startDestination){
        composable(ROUTE_HOME){
            Home(navController)
        }
        composable(ROUTE_ABOUT){
            About(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
    }
}