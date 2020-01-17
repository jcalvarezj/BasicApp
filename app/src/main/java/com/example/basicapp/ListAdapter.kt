package com.example.kotlinjava

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val dataSet: List<Record>): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
        var txtDescription: TextView = itemView.findViewById(R.id.txtDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_list, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val record: Record = dataSet[position]
        holder.txtTitle.text = record.title
        holder.txtDescription.text = record.description
    }

}