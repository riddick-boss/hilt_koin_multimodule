package com.example.hiltkoinmultimodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hilt.presentation.HiltScreen
import com.example.hiltkoinmultimodule.ui.theme.HiltKoinMultimoduleTheme
import com.example.koin.presentation.KoinScreen
import com.example.koin_annotations.presentation.KoinAnnotationsScreen
import dagger.hilt.android.AndroidEntryPoint
import org.koin.androidx.compose.KoinAndroidContext

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
                KoinAndroidContext {
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
                        composable(NavScreens.KOIN_SCREEN.navRoute) {
                            KoinScreen(navController)
                        }
                        composable(NavScreens.KOIN_ANNOTATIONS_SCREEN.navRoute) {
                            KoinAnnotationsScreen(navController)
                        }
                    }
                }
            }
        }
    }
}