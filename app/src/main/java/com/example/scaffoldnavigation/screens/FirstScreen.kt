package com.example.scaffoldnavigation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FirstScreen(
    navHostController: NavHostController
){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = {},
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "FirstScreen"
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navHostController.navigate(Screens.secondScreen)
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = ""
                )
            }
        }

    )

}