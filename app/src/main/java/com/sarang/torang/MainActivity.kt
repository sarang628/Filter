package com.sarang.torang

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sryang.screen_filter.ui.FilterScreen
import com.sryang.screen_filter.ui.FilterViewModel
import com.sryang.torang.ui.TorangTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val filterViewModel: FilterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TorangTheme {
                Surface(Modifier.Companion.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                    var isVisible by remember { mutableStateOf(false) }
                    Box(Modifier.Companion.fillMaxSize()) {
                        FilterScreen(filterViewModel, visible = isVisible)
                        Button(modifier = Modifier.Companion.align(Alignment.Companion.Center), onClick = { isVisible = !isVisible }) {}
                    }
                }
            }
        }
    }
}