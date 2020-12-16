package gr.ote.android.codehub_academy.network

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import gr.ote.android.codehub_academy.R

class NetworkListAdapter : ListAdapter<String, NetworkViewHolder>(DiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NetworkViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.holder_network, parent, false)

        return NetworkViewHolder(view)
    }

    override fun onBindViewHolder(holder: NetworkViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class DiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(o: String, t1: String): Boolean {
        return o == t1
    }

    override fun areContentsTheSame(o: String, t1: String): Boolean {
        return o == t1
    }
}