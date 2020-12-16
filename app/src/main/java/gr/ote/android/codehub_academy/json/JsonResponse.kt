package gr.ote.android.codehub_academy.json

data class JsonResponse(
    val channels: List<JsonChannel>
)

data class JsonChannel(
    val shows: List<JsonShow>,
    val channelName: String
)

data class JsonShow(
    val title: String,
    val startTimeCaption: String,
    val endTimeCaption: String
)