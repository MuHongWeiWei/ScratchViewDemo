package com.example.scratchviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cooltechworks.views.ScratchImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scratchView.setRevealListener(object : ScratchImageView.IRevealListener {
            override fun onRevealed(iv: ScratchImageView?) {

            }

            override fun onRevealPercentChangedListener(siv: ScratchImageView?, percent: Float) {
                if (percent > 0.8) {
                    siv!!.reveal()
                }
            }
        })
    }
}
