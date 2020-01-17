package com.example.kotlinjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var listAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val data: List<Record> = mutableListOf<Record>(
            Record("Titulo 1", "Descripcion 1"),
            Record("Something", "Example"),
            Record("3", "---------")
        )

        listAdapter = ListAdapter(data)

        recyclerView = findViewById<RecyclerView>(R.id.rvCosas).apply {
            adapter = listAdapter
        }

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}
