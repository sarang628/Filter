package com.sarang.torang.compose

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp

typealias FilterImageLoader = @Composable (modifier: Modifier, url: String, width: Dp?, height: Dp?, contentScale: ContentScale?) -> Unit

val LocalFilterImageLoader = compositionLocalOf<FilterImageLoader> {
    // 기본 구현: 경고 로그 출력
    @Composable { modifier, _, _, _, _ ->
        Box(modifier = modifier)
        Log.w("__FilterImageLoader", "No FilterImageLoader provided.")
    }
}