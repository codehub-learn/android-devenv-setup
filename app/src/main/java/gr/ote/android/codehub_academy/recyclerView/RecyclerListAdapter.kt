package gr.ote.android.codehub_academy.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import gr.ote.android.codehub_academy.R
import gr.ote.android.codehub_academy.recyclerView.models.RecycleItems
import gr.ote.android.codehub_academy.recyclerView.models.RecyclerLine
import gr.ote.android.codehub_academy.recyclerView.viewholders.LineViewHolder
import gr.ote.android.codehub_academy.recyclerView.viewholders.RecyclerViewHolder

class RecyclerListAdapter(val listener: ConsumeClickEvents) :
    ListAdapter<RecycleItems, RecyclerView.ViewHolder>(DiffCallback()) {
    private val type1: Int = 0
    private val type2: Int = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            type1 -> {
                val itemView: View =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.holder_user_data, parent, false)
                return RecyclerViewHolder(itemView,listener)
            }
            type2 -> {
                val itemView: View =
                    LayoutInflater.from(parent.context).inflate(R.layout.holder_line, parent, false)
                return LineViewHolder(itemView)
            }
            else -> {
                val itemView: View =
                    LayoutInflater.from(parent.context).inflate(R.layout.holder_line, parent, false)
                return LineViewHolder(itemView)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is RecyclerLine -> type2
            else -> type1
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is RecyclerViewHolder -> holder.bind(getItem(position))
            is LineViewHolder -> holder.bind()
        }
    }

}