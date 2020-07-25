package com.sw.hostsdkappexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCatch.setOnClickListener {
            try {
                throw NullPointerException("null? but its kotlin!?")
            } catch (e: NullPointerException) {
                Toast.makeText(this, "caught exception ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }

        btnIllegal.setOnClickListener {
            throw IllegalStateException("state is not valid")

        }

        btnArrayIndex.setOnClickListener {
            val arr = arrayOf(1, 2, 3)
            arr[50] = 10
        }
    }
}