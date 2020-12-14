package gr.ote.android.codehub_academy.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import gr.ote.android.codehub_academy.R
import gr.ote.android.codehub_academy.recyclerView.models.RecycleItems
import gr.ote.android.codehub_academy.recyclerView.viewholders.LineViewHolder

class RecyclerAdapter(val list: List<RecycleItems> = emptyList()) :
    RecyclerView.Adapter<LineViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.holder_user_data, parent, false)
        return LineViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
        holder.bind()
    }

}