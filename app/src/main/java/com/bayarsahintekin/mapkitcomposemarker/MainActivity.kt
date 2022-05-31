package com.bayarsahintekin.mapkitcomposemarker

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.bayarsahintekin.mapkitcomposemarker.theme.AppTheme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                AppDesign()
            }
        }
    }

    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    fun AppDesign() {
        Scaffold(
            content = {
                Map()
                BottomSheet()
            }
        )

    }

}