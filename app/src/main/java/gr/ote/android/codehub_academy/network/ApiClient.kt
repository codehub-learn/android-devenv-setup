package gr.ote.android.codehub_academy.network

import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import gr.ote.android.codehub_academy.json.JsonResponse
import gr.ote.android.codehub_academy.network.RetrofitInstance.retrofit
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://tv-zapping.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create(Gson()))
        .build()
}

class ApiClient {

    fun getProgram(callback: CallbackInterface) {
        val service = retrofit.create(ApiInterface::class.java)

        service.getProgram().enqueue(object : Callback<JsonResponse> {
            override fun onFailure(call: Call<JsonResponse>, t: Throwable) {
                callback.onFailed(Exception("getProgram endpoint return an error", t))
            }

            override fun onResponse(call: Call<JsonResponse>, response: Response<JsonResponse>) {
                when (response.isSuccessful) {
                    true -> {
                        GlobalScope.launch {
                            withContext(Dispatchers.Default) {
                                delay(4000)
                            }

                            withContext(Dispatchers.Main) {
                                response.body()?.also { callback.onSuccess(it) }
                                    ?: callback.onEmptyResponse()
                            }
                        }
//                        val result = response.body()
//
//                        when (result) {
////                            null -> callback.onFailed(Exception("empty response"))
//                            null -> callback.onEmptyResponse()
////                            else -> callback.onSuccess(result)
//
//                        }
                    }
                    false -> {
                        callback.onServerError(Exception((response.errorBody().toString())))
//                        callback.onFailed(
//                            Exception((response.errorBody().toString()))
//                        )
                    }
                }
            }
        })
    }

    fun getProgramWithLiveData(
        streamData: MutableLiveData<JsonResponse?>,
        streamError: MutableLiveData<Exception>
    ) {
        val service = retrofit.create(ApiInterface::class.java)

        service.getProgram().enqueue(object : Callback<JsonResponse> {
            override fun onFailure(call: Call<JsonResponse>, t: Throwable) {
                streamError.postValue(Exception("getProgram endpoint return an error", t))
            }

            override fun onResponse(call: Call<JsonResponse>, response: Response<JsonResponse>) {
                when (response.isSuccessful) {
                    true -> {
                        streamData.postValue(response.body())
                    }
                    false -> {
                        streamError.postValue(Exception((response.errorBody().toString())))
                    }
                }
            }
        })
    }
}