package com.sryang.torangscreenfilter

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.sryang.torang_repository.repository.FindRepository
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