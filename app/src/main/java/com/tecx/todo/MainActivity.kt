package com.tecx.todo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ic_logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))


        Handler().postDelayed({

            ic_logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_out))

            Handler().postDelayed({

                ic_logo.visibility = View.GONE
                startActivity(Intent(this, TodoListActivity::class.java))
                finish()

            }, 500)

        }, 1500)

    }
}
