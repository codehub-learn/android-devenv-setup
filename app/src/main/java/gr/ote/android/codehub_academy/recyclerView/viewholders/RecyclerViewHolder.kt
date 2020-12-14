package gr.ote.android.codehub_academy.recyclerView.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import gr.ote.android.codehub_academy.recyclerView.ConsumeClickEvents
import gr.ote.android.codehub_academy.recyclerView.models.RecycleDataModel
import gr.ote.android.codehub_academy.recyclerView.models.RecycleItems
import kotlinx.android.synthetic.main.holder_user_data.view.*

class RecyclerViewHolder(itemView: View, private val listener: ConsumeClickEvents) :
    RecyclerView.ViewHolder(itemView) {

    fun bind(data: RecycleItems) {
        when (data) {
            is RecycleDataModel -> bind(data)
        }
    }

    fun bind(data: RecycleDataModel) {
        itemView.user_data_hint.text = data.hint
        itemView.user_data_value.text = data.value

        itemView.user_data_value.setOnClickListener {
            listener.onClick(data, it)
        }
    }

}