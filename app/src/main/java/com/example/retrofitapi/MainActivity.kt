package com.example.retrofitapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.retrofitapi.ui.theme.MyApplicationTheme
import com.example.retrofitapi.ui.view.PostListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            MyApplicationTheme{
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.LightGray
                ) {
                    PostListScreen(paddingValues = it)
                }
            }

        }
    }
}