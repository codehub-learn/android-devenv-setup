package gr.ote.android.codehub_academy.network

import gr.ote.android.codehub_academy.json.JsonResponse

interface CallbackInterface {

    fun onSuccess(data: JsonResponse)
    fun onEmptyResponse()
    fun onServerError(exception: Exception)
    fun onFailed(exception: Exception)
}