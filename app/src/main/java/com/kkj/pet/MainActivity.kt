package com.kkj.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
class MainActivity : AppCompatActivity() {

    private val petList: List<Pair<String, String>> = listOf(
        Pair("cat", "https://wallpapers.pictures/media/hi-human-3-wallpaper-background-1080x1920.jpg"),
        Pair("dog", "https://www.pinterest.co.kr/pin/572309065147472884/"),
        Pair("parrot", "https://www.pinterest.co.kr/pin/302304193710843368/"),
        Pair("rabbit", "https://www.zedge.net/wallpaper/3540afc4-c215-4940-8730-1563a70ece04")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("Activity", "Start Main Activity")

        for ((i, pet) in petList.withIndex()) {

            // 1..petList.size / 0 until petList.size
            val id = resources.getIdentifier("btn${i + 1}", "id", packageName)
            // "btn" + i.toString() / "btn" + i
            val view = findViewById<Button>(id)
            view.text = pet.first
            view.setOnClickListener {
                val intent = Intent(this@MainActivity, ImgActivity::class.java)
                intent.putExtra("pet", pet.first)
                intent.putExtra("link", pet.second)
                startActivity(intent)
            }
            // btn1.setOnClickListener
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.v("Activity", "Finish Main Activity")
    }
}