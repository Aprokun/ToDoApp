package com.example.todoit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import org.w3c.dom.Text

class TaskAdapter(context: Context, resource: Int, objects: MutableList<Task>) :
    ArrayAdapter<Task>(context, resource, objects) {
    val layout = resource
    val tasks = objects
    val inflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = inflater.inflate(this.layout, parent, false)

        view.findViewById<TextView>(R.id.task_name).text = tasks[position].name
        view.findViewById<TextView>(R.id.task_date).text = tasks[position].date

        return view
    }
}