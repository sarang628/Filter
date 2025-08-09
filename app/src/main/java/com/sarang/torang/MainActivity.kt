package com.sarang.torang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sarang.torang.compose.FilterImageLoader
import com.sarang.torang.compose.LocalFilterImageLoader
import com.sarang.torang.di.image.provideTorangAsyncImage
import com.sarang.torang.repository.FindRepository
import com.sarang.torang.ui.FilterScreen
import com.sarang.torang.ui.FilterViewModel
import com.sryang.torang.ui.TorangTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val filterViewModel: FilterViewModel by viewModels()
    @Inject lateinit var findRepository: FindRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TorangTheme {
                Surface(Modifier.Companion.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                    val restaurants = findRepository.restaurants.collectAsState().value

                    var isVisible by remember { mutableStateOf(false) }
                    Box(Modifier.Companion.fillMaxSize()) {
                        CompositionLocalProvider(LocalFilterImageLoader provides customImageLoader) {
                            FilterScreen(filterViewModel, visible = isVisible)
                        }
                        Button(modifier = Modifier.Companion.align(Alignment.Companion.Center), onClick = { isVisible = !isVisible }) {}

                        LazyColumn(Modifier.padding(top = 200.dp)) {
                            items(restaurants.size){
                                Text(restaurants[it].restaurantName)
                            }
                        }
                    }
                }
            }
        }
    }

    val customImageLoader: FilterImageLoader = { modifier, url, width, height, scale ->
        // 여기서 실제 이미지 로딩 구현 예시
        provideTorangAsyncImage().invoke(modifier, url, width, height, scale)
    }
}
