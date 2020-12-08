package com.koleychik.testgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("don't do that anymore")
        println("commit first")
        println("commit second")
        print("i am saying, that i am ")
    }
}