package com.saad.e_commerceapp.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.saad.e_commerceapp.screens.authentication.ForgetPasswordScreen
import com.saad.e_commerceapp.screens.authentication.LoginScreen
import com.saad.e_commerceapp.screens.authentication.SignUpScreen
import com.saad.e_commerceapp.screens.bottomnav.AppNavigation
import dagger.hilt.android.AndroidEntryPoint

const val a = 10

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            if (a == 10) {
                App()
            } else {
                AppNavigation()
            }
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable(route = "login") {
            LoginScreen(navController)

        }
        composable(route = "signup") {
            SignUpScreen(navController)
        }
        composable(route = "forgetPass") {
            ForgetPasswordScreen(navController)
        }
        composable("home") {
            AppNavigation()
        }
    }
}
