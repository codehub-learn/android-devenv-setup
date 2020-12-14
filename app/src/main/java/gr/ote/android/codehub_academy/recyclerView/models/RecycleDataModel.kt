package gr.ote.android.codehub_academy.recyclerView.models

data class RecycleDataModel(
    val hint: String,
    val value: String
) : RecycleItems {
    override fun areSameContent(o: RecycleItems) = when (o is RecycleDataModel) {
        true -> hint == o.value && value == o.value
        false -> false
    }
}