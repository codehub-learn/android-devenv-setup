package gr.ote.android.codehub_academy

import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import gr.ote.android.codehub_academy.recyclerView.ConsumeClickEvents
import gr.ote.android.codehub_academy.recyclerView.RecyclerListAdapter
import gr.ote.android.codehub_academy.recyclerView.models.RecycleDataModel
import gr.ote.android.codehub_academy.recyclerView.models.RecycleItems
import gr.ote.android.codehub_academy.recyclerView.models.RecyclerLine
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AbstractActivity(R.layout.activity_list) {
    private var runClickEventAction = false
    override fun initLayout() {
//        recyclerView.adapter = RecyclerAdapter(list)

        recyclerView.adapter = RecyclerListAdapter(object : ConsumeClickEvents {
            override fun onClick(data: RecycleDataModel, view: View) {
                when (runClickEventAction) {
                    false -> {
                        when (data.value) {
                            "B", "C", "D" -> {
                                Toast.makeText(
                                    this@ListActivity,
                                    "user press the " + data.value,
                                    Toast.LENGTH_SHORT
                                )
                                runClickEventAction = false
                            }
                            else -> {
                                Snackbar.make(
                                    view, "user press the " + data.value, Snackbar.LENGTH_SHORT
                                ).show()
                                runClickEventAction = false
                            }
                        }
                    }
                }
            }

        })
    }

    override fun startOperations() {
        val list = mutableListOf<RecycleItems>(
            RecycleDataModel(
                "A",
                "B"
            ),
            RecyclerLine(),
            RecycleDataModel(
                "B",
                "C"
            ),
            RecyclerLine(),
            RecycleDataModel(
                "C",
                "D"
            ),
            RecyclerLine(),
            RecycleDataModel(
                "D",
                "E"
            ),
            RecyclerLine(),
            RecycleDataModel(
                "E",
                "F"
            ),
            RecyclerLine(),
            RecycleDataModel(
                "F",
                "G"
            ),
            RecyclerLine()
        )

        val adapter = recyclerView.adapter
        when (adapter is RecyclerListAdapter) {
            true -> adapter.submitList(list)
        }
    }

    override fun stopOperations() {
    }

}
