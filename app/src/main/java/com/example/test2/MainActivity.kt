package com.example.test2

//import android.widget.Button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //navbar
        var mMainButtonMenu:Button = findViewById(R.id.main_button_menu)
        var mMainButtonHome:Button = findViewById(R.id.main_button_home)
        var mMainButtonBack:Button = findViewById(R.id.main_button_back)

        val elMainNavigationViewMenu: NavigationView = findViewById(R.id.main_navigationView_menu)

        mMainButtonHome.setOnClickListener(View.OnClickListener {

            val mainActivityIntent = Intent(this@MainActivity, TodoListActivity::class.java)
            startActivity(mainActivityIntent)
        })
        mMainButtonBack.setOnClickListener(View.OnClickListener {



            //val mainActivityIntent = Intent(this@TodoListActivity, MainActivity::class.java)
            //startActivity(mainActivityIntent)
        })
        mMainButtonMenu.setOnClickListener(View.OnClickListener {

            when(elMainNavigationViewMenu.visibility){
                View.GONE -> elMainNavigationViewMenu.visibility = View.VISIBLE
                View.VISIBLE -> elMainNavigationViewMenu.visibility = View.GONE
                else -> elMainNavigationViewMenu.visibility = View.VISIBLE
            }

        })
    }


}