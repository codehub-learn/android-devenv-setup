package gr.ote.android.codehub_academy.recyclerView

import androidx.recyclerview.widget.DiffUtil
import gr.ote.android.codehub_academy.recyclerView.models.RecycleDataModel
import gr.ote.android.codehub_academy.recyclerView.models.RecycleItems

class DiffCallback : DiffUtil.ItemCallback<RecycleItems>() {
    override fun areItemsTheSame(o: RecycleItems, t1: RecycleItems): Boolean {
        return o == t1
    }

    override fun areContentsTheSame(o: RecycleItems, t1: RecycleItems): Boolean {
        return o.areSameContent(t1)
    }
}