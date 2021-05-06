package com.example.hellotoast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

const val COUNT_MESSAGE = "count"

class MainActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {

        val intent = Intent(this, HelloActivity::class.java)
        intent.putExtra(COUNT_MESSAGE, mCount)
        startActivity(intent)
    }

    fun countUp(view: View) {
        mCount++

        if(mShowCount != null)
            mShowCount?.setText(mCount.toString())
    }
}