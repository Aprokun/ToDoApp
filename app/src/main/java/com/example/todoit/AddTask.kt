package com.example.todoit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import java.util.*

class AddTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
    }

    fun addTask(v: View?) {
        val taskName = findViewById<EditText>(R.id.new_task_name).text.toString()
        val taskDate = findViewById<DatePicker>(R.id.new_task_date)

        val dateString = taskDate.dayOfMonth.toString() + "." + taskDate.month.toString() + "." + taskDate.year.toString()

        val data = Intent()

        data.putExtra("taskName", taskName)
        data.putExtra("taskDate", dateString)

        setResult(RESULT_OK, data)

        finish()
    }

}