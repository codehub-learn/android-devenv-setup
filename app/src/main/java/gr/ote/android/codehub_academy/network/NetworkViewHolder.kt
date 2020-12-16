package gr.ote.android.codehub_academy.network

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.holder_network.view.*

class NetworkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(data: String) {
        itemView.network_title.text = data
    }
}