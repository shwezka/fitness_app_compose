package com.example.fitness_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitness_app.FillYourProfile.FillYourProfile
import com.example.fitness_app.LoginAndRegister.ForgottenPassword
import com.example.fitness_app.LoginAndRegister.LoginScreen
import com.example.fitness_app.LoginAndRegister.RegistrationScreen
import com.example.fitness_app.LoginAndRegister.SetPassword
import com.example.fitness_app.Physical.PhysicalActivityLevel
import com.example.fitness_app.Preview.LoadingScreen
import com.example.fitness_app.Preview.PreviewScreen
import com.example.fitness_app.SetUp.SetUpGender
import com.example.fitness_app.SetUp.SetUpYearOld
import com.example.fitness_app.SetUp.SetupMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Navidator()
                }

        }
    }
}

@Composable
fun Navidator (){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "LoadingScreen"
    ) {
        composable(route = "LoadingScreen",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
//            LoadingScreen(navController)
            SetupMain(navController)
        }
        composable(route = "PreviewScreen",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            PreviewScreen(navController)
        }
        composable(route = "LoginScreen",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            LoginScreen(navController)
        }
        composable(route = "RegistrationScreen",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            RegistrationScreen(navController)
        }
        //ForgottenPassword
        composable(route = "ForgottenPassword",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            ForgottenPassword(navController)
        }
        //SetPassword
        composable(route = "SetPassword",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            SetPassword(navController)
        }
        //SetupMain
        composable(route = "SetupMain",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            SetupMain(navController)
        }
        //SetUpGender
        composable(route = "SetUpGender",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            SetUpGender(navController)
        }
        //SetUpYearOld
        composable(route = "SetUpYearOld",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            SetUpYearOld(navController)
        }
        composable(route = "PhysicalActivityLevel",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
        ) {
            PhysicalActivityLevel(navController)
        }
        composable(route = "FillYourProfile",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 100)) },
            popEnterTransition = { fadeIn(animationSpec = tween(durationMillis = 100)) },
            popExitTransition = { fadeOut(animationSpec = tween(durationMillis = 1)) },
            ){
            FillYourProfile(navController)
        }
    }

}
