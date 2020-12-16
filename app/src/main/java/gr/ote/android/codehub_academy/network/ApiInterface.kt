package gr.ote.android.codehub_academy.network

import gr.ote.android.codehub_academy.json.JsonResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("v2/tv")
    fun getProgram() : Call<JsonResponse>
}