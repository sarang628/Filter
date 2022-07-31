package com.sryang.torangscreenfilter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import com.example.torang_core.repository.FindRepository
import com.sryang.screen_filter.FilterViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    /** 공유 뷰모델 */
    @Inject
    lateinit var filding: FindRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnShow).setOnClickListener {
            lifecycleScope.launch {
                filding.clickMap()
            }
        }
    }
}