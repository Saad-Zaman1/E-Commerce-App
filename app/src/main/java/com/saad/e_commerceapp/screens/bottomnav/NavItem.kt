package com.saad.e_commerceapp.screens.bottomnav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val listOfNavItem = listOf(
    NavItem(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screens.Home.name
    ),
    NavItem(
        label = "Shop",
        icon = Icons.Outlined.ShoppingCart,
        route = Screens.Shop.name
    ),
    NavItem(
        label = "Bag",
        icon = Icons.Outlined.AccountBox,
        route = Screens.Bag.name
    ),
    NavItem(
        label = "Favorite",
        icon = Icons.Outlined.FavoriteBorder,
        route = Screens.Favorite.name
    ),
    NavItem(
        label = "Profile",
        icon = Icons.Outlined.Person,
        route = Screens.Profile.name
    ),
)
