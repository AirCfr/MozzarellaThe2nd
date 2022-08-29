package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class TodoListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_list)

        //navbar
        var mTodoListButtonMenu:Button = findViewById(R.id.todolist_button_menu)
        var mTodoListButtonHome:Button = findViewById(R.id.todolist_button_home)
        var mTodoListButtonBack:Button = findViewById(R.id.todolist_button_back)

        mTodoListButtonHome.setOnClickListener(View.OnClickListener {
            fun onClick(v: View){

            }
            val mainActivityIntent = Intent(this@TodoListActivity, MainActivity::class.java)
            startActivity(mainActivityIntent)
        })
        mTodoListButtonBack.setOnClickListener(View.OnClickListener {

            val text: TextView = findViewById(R.id.textView)
            text.text = "teste"

            //val mainActivityIntent = Intent(this@TodoListActivity, MainActivity::class.java)
            //startActivity(mainActivityIntent)
        })
    }
}