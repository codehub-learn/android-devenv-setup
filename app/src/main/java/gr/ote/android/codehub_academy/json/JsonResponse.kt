package gr.ote.android.codehub_academy.json

import com.google.gson.JsonObject

data class JsonResponse(
    val channels: List<JsonChannel>
)

data class JsonChannel(
    val shows: List<JsonObject>,
    val channelName: String
)