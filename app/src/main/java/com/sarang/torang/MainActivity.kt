package com.sarang.torang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.sarang.torang.compose.FilterDrawerScreen
import com.sarang.torang.compose.FilterImageLoader
import com.sarang.torang.compose.FilterScreen
import com.sarang.torang.compose.FilterScreenPreview
import com.sarang.torang.compose.FilterViewModel
import com.sarang.torang.compose.LocalFilterImageLoader
import com.sarang.torang.data.RestaurantWithFiveImages
import com.sarang.torang.di.image.provideTorangAsyncImage
import com.sarang.torang.repository.FindRepository
import com.sarang.torang.uistate.FilterCallback
import com.sryang.torang.ui.TorangTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val filterViewModel: FilterViewModel by viewModels()
    @Inject lateinit var findRepository: FindRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TorangTheme {
                Surface(Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background)) {
                    FilterScreenTest()
                }
            }
        }
    }

    @Composable
    fun FilterScreenTest(){
        val coroutine = rememberCoroutineScope()

        val restaurants : List<RestaurantWithFiveImages> = findRepository.restaurants
            .stateIn(scope = coroutine,
                started = SharingStarted.Eagerly,
                initialValue = listOf()).value
        val drawerState : DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        var isVisible by remember { mutableStateOf(false) }
        CompositionLocalProvider(LocalFilterImageLoader provides customImageLoader) {
            FilterDrawerScreen(filterViewModel = filterViewModel, 
                               drawerState = drawerState) {
                Box(Modifier.fillMaxSize()) {
                    FilterScreen(filterViewModel = filterViewModel,
                                 visible         = isVisible,
                                 filterCallback  = FilterCallback(
                                 onFilter        = {coroutine.launch { drawerState.open() }}
                        ),
                    )
                    Column(modifier = Modifier.align(Alignment.Center)) {
                        Button(onClick = { isVisible = !isVisible }) {}
                    }
                    LazyColumn(Modifier.padding(top = 200.dp)) {
                        items(restaurants.size){
                            Text(restaurants[it].restaurant.restaurantName)
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

@PreviewLightDark
@Composable
fun PreviewFilterScreen(){
    TorangTheme {
        FilterScreenPreview()
    }
}
