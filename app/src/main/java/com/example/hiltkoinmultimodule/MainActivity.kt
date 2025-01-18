package com.example.hiltkoinmultimodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hilt.presentation.hiltscreen.HiltScreen
import com.example.hiltkoinmultimodule.ui.theme.HiltKoinMultimoduleTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author Pawel Kremienowski
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HiltKoinMultimoduleTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = NavScreens.START_SCREEN.navRoute
                ) {
                    composable(NavScreens.START_SCREEN.navRoute) {
                        StartScreen(navController)
                    }
                    composable(NavScreens.HILT_SCREEN.navRoute) {
                        HiltScreen(navController)
                    }
                }
            }
        }
    }
}