package com.kkj.pet

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_img.*
import java.util.*

class ImgActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img)

        Log.v("Activity", "Start Image Activity")

        val pet = intent.getStringExtra("pet")
        if (pet != null && pet.isNotEmpty()) {
            val img = resources.getIdentifier(pet, "drawable", packageName)
            petView.setImageResource(img)
            nameView.text = pet.toUpperCase(Locale.ENGLISH)
            nameView.visibility = View.VISIBLE

            val link = intent.getStringExtra("link")
            if (link != null && link.isNotEmpty()) {
                linkView.text = link
                linkView.visibility = View.VISIBLE
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Activity", "Finish ${ImgActivity::class.simpleName}")
    }
}