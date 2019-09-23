package com.example.android_custom_view_ray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


// 1
        happyButton.setOnClickListener({
            emotinalFaveView.happinessState = EmotionalFaceView.HAPPY
        })
// 2
        sadButton.setOnClickListener({
            emotinalFaveView.happinessState = EmotionalFaceView.SAD
        })


    }
}
