package com.example.fitness_app.FloatingMenu.BottomNavigation

import com.example.fitness_app.R

sealed class BottomNavItems(val iconId: Int, val route: String) {
    object HomeScreen : BottomNavItems(R.drawable.house_icon,"ProfileScreen")//Todo заменить на необходимое окно
    object NotificationScreen : BottomNavItems(R.drawable.notification_icon,"ProfileScreen")
    object FavoriteScreen : BottomNavItems(R.drawable.favorite_icon,"ProfileScreen")
    object SupportScreen : BottomNavItems(R.drawable.support_icon,"ProfileScreen")
}