package com.example.test2

import androidx.appcompat.app.AppCompatActivity

//object BackSingleton {
//    init {
//
//    }
//
//    var variable: AppCompatActivity? = null
//
//
//}

object BackSingleton {


    var PreviousView: AppCompatActivity = MainActivity()
    fun getPreviousW(): AppCompatActivity {
        return PreviousView
    }
    fun setPreviousW(view: AppCompatActivity) {
        PreviousView = view
    }


}