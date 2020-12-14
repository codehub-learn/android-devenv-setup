package gr.ote.android.codehub_academy.recyclerView

import android.view.View
import gr.ote.android.codehub_academy.recyclerView.models.RecycleDataModel

interface ConsumeClickEvents {
    fun onClick(data: RecycleDataModel, view: View)
}