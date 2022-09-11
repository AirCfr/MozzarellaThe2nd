package com.example.test2

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

interface IBackable {
    var activityIntent: AppCompatActivity?
    fun back(): Intent{
        return when(activityIntent){
            null -> Intent.makeMainActivity(ComponentName.unflattenFromString("MainActivity"))
            else -> Intent.makeMainActivity(ComponentName.unflattenFromString("MainActivity"))
        }
    }

}