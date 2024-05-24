package com.example.fitness_app.FloatingMenu.BottomNavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.fitness_app.ui.theme.Purple

@Composable
fun BottomNavigation(navController: NavController) {
    val listItems = listOf(
        BottomNavItems.HomeScreen,
        BottomNavItems.NotificationScreen,
        BottomNavItems.FavoriteScreen,
        BottomNavItems.SupportScreen
    )
    NavigationBar(
        Modifier.background(color = Purple)
            .height(59.dp),
        containerColor = Purple
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRout = backStackEntry?.destination?.route
        listItems.forEach{item->
            NavigationBarItem(
                selected = currentRout == item.route,
                onClick = { navController.navigate(item.route) },
                icon = { Image(
                painter = painterResource(id = item.iconId),
                contentDescription ="",

                )}


            )
        }
    }
}