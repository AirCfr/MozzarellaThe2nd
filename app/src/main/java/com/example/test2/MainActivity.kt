package com.example.test2

//import android.widget.Button
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    //override var activityIntent: AppCompatActivity?
    //    get() = activityIntent
    //    set(value) {
    //        when(value){
    //            null ->
    //        }
    //    }
    // , IBackable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val elMainNavigationViewMenu: NavigationView = findViewById(R.id.main_navigationView_menu)
        val elNavmainButtonMenuTodolist: Button = findViewById(R.id.main_button_menu_todolist)
        val elNavmainButtonMenuPersonae: Button = findViewById(R.id.main_button_menu_personae)


        //===================================== navbar =============================================

        var mMainButtonMenu:Button = findViewById(R.id.main_button_menu)
        var mMainButtonHome:Button = findViewById(R.id.main_button_home)
        var mMainButtonBack:Button = findViewById(R.id.main_button_back)

        mMainButtonHome.setOnClickListener(View.OnClickListener {

            val mainActivityIntent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(mainActivityIntent)
        })
        mMainButtonBack.setOnClickListener(View.OnClickListener {

            if(elMainNavigationViewMenu.visibility == View.VISIBLE){
                elMainNavigationViewMenu.visibility = View.GONE
            }
            else{
                val mainActivityIntent = Intent(this@MainActivity, BackSingleton.getPreviousW()::class.java)
                BackSingleton.setPreviousW(this@MainActivity)
                startActivity(mainActivityIntent)
            }

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

        //============================= nav view ===================================================

        elNavmainButtonMenuTodolist.setOnClickListener(View.OnClickListener {
            val todoListActivityIntent = Intent(this@MainActivity, TodoListActivity::class.java)
            BackSingleton.setPreviousW(this@MainActivity)
            startActivity(todoListActivityIntent)
        })

        elNavmainButtonMenuPersonae.setOnClickListener(View.OnClickListener {
            Log.d("Debug", "W.I.P");
        })
    }




}