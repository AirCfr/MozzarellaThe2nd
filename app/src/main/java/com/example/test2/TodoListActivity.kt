package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.android.material.navigation.NavigationView

class TodoListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_list)

        val elTodoListNavigationViewMenu: NavigationView = findViewById(R.id.todolist_navigationView_menu)
        val elNavTodoListButtonMenuTodolist: Button = findViewById(R.id.todolist_button_menu_todolist)
        val elNavTodoListButtonMenuPersonae: Button = findViewById(R.id.todolist_button_menu_personae)

        //===================================== navbar =============================================

        var mTodoListButtonMenu:Button = findViewById(R.id.todolist_button_menu)
        var mTodoListButtonHome:Button = findViewById(R.id.todolist_button_home)
        var mTodoListButtonBack:Button = findViewById(R.id.todolist_button_back)

        mTodoListButtonHome.setOnClickListener(View.OnClickListener {

            val mainActivityIntent = Intent(this@TodoListActivity, MainActivity::class.java)
            startActivity(mainActivityIntent)
        })
        mTodoListButtonBack.setOnClickListener(View.OnClickListener {

            if(elTodoListNavigationViewMenu.visibility == View.VISIBLE){
                elTodoListNavigationViewMenu.visibility = View.GONE
            }
            else{
                val mainActivityIntent = Intent(this@TodoListActivity, BackSingleton.getPreviousW()::class.java)
                BackSingleton.setPreviousW(this@TodoListActivity)
                startActivity(mainActivityIntent)
            }

        })
        mTodoListButtonMenu.setOnClickListener(View.OnClickListener {

            when(elTodoListNavigationViewMenu.visibility){
                View.GONE -> elTodoListNavigationViewMenu.visibility = View.VISIBLE
                View.VISIBLE -> elTodoListNavigationViewMenu.visibility = View.GONE
                else -> elTodoListNavigationViewMenu.visibility = View.VISIBLE
            }

        })

        //============================= nav view ===================================================

        elNavTodoListButtonMenuTodolist.setOnClickListener(View.OnClickListener {
            val todoListActivityIntent = Intent(this@TodoListActivity, TodoListActivity::class.java)
            BackSingleton.setPreviousW(this@TodoListActivity)
            startActivity(todoListActivityIntent)
        })

        elNavTodoListButtonMenuPersonae.setOnClickListener(View.OnClickListener {
            Log.d("Debug", "W.I.P");
        })

    }
}