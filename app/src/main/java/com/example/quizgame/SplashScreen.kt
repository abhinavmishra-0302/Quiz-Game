package com.example.quizgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : AppCompatActivity() {

    lateinit var animation:Animation
    lateinit var imageView: ImageView
    lateinit var textView:TextView

    lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        animation = AnimationUtils.loadAnimation(this, R.anim.anim_image)

        imageView = findViewById(R.id.imageView)
        imageView.setAnimation(animation)

        textView = findViewById(R.id.textView)
        textView.translationY = -5000f

        timer = object :CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                textView.animate().translationYBy(5000f).duration = 2000

                var timer1: CountDownTimer = object : CountDownTimer(2000, 1000){
                    override fun onTick(p0: Long) {
                    }

                    override fun onFinish() {
                        var intent:Intent = object : Intent(this, MainActivity.)
                    }

                }.start()
            }

        }.start()
    }
}

