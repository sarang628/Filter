package com.sarang.torang.compose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sarang.torang.uistate.FilterCallback

/**
 * @param filterViewModel   filter 뷰모델
 * @param visible           필터 표시 여부
 */
//@formatter:off
@Composable
fun FilterScreen(
    filterViewModel : FilterViewModel           = hiltViewModel(),
    visible         : Boolean                   = false,
    topPadding      : Dp                        = 0.dp,
    filterCallback  : FilterCallback            = FilterCallback(),
) {
    val uiState = filterViewModel.uiState
    Filter(
        uiState         = uiState,
        visible         = visible,
        topPadding      = topPadding,
        filterCallback  = FilterCallback(
            onThisArea      = { filterViewModel.onThisArea() },
            onFilter        = { filterCallback.onFilter() },
            onFilterCity    = { filterViewModel.onCity(it)
                                filterCallback.onFilterCity(it) },
            onFilterNation  = { filterViewModel.onNation(it)
                                filterCallback.onFilterNation(it) },
            onSearch        = { filterCallback.onSearch() },
            onQueryChange   = { filterViewModel.setQuery(it) }
                                        )
    )
}
//@formatter:on

@Composable
fun Filter(
    uiState          : FilterUiState     = FilterUiState(),
    visible          : Boolean           = false,
    filterCallback   : FilterCallback    = FilterCallback(),
    topPadding       : Dp = 0.dp) {
    val density = LocalDensity.current

    AnimatedVisibility(visible = visible, enter = slideInVertically { with(density) { -200.dp.roundToPx() } }, exit = slideOutVertically { with(density) { -200.dp.roundToPx() } }) {
        Column(Modifier.padding(start = 8.dp, end = 8.dp, top = topPadding)) {
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth().background(Color.Transparent)) {
                _SearchBar(keyword = uiState.keyword, onQueryChange = filterCallback.onQueryChange, onSearch = filterCallback.onSearch)
            }
            Spacer(Modifier.height(8.dp))

            Box(Modifier.fillMaxWidth()) {
                FilterButton(modifier   = Modifier.align(Alignment.CenterStart),
                             text       = "filter",
                             onClick    = filterCallback.onFilter)
                FilterButton(modifier   = Modifier.align(Alignment.Center),
                             text       = "search this area",
                             onClick    = filterCallback.onThisArea,
                             shape      = CircleShape)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun _SearchBar(keyword: String, onQueryChange: (String) -> Unit, onSearch: () -> Unit) {
    val keyboardController = LocalSoftwareKeyboardController.current
    SearchBar(
        query = keyword,
        onQueryChange = onQueryChange,
        placeholder = { Text("search") },
        onSearch = { keyboardController?.hide(); onSearch.invoke() },
        active = false,
        onActiveChange = {},
        leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
        trailingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "") },
        modifier = Modifier.fillMaxWidth(),
        content = {}
    )
}

@Preview
@Composable
fun FilterScreenPreview() {
    Filter(/*Preview*/
        uiState = FilterUiState(
            type = "",
            foodType = listOf(),
            price = listOf(),
            rating = listOf(),
            distance = "",
        ),
        visible = true,
    )
}
