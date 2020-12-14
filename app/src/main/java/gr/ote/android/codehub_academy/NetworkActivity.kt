package gr.ote.android.codehub_academy

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import gr.ote.android.codehub_academy.json.JsonResponse

class NetworkActivity : AbstractActivity(R.layout.activity_network) {

    override fun initLayout() {}

    override fun startOperations() {
        val queue = Volley.newRequestQueue(this)
        val url = "https://tv-zapping.herokuapp.com/v2/tv"

// Request a string response from the provided URL.
        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                response
               val result =  Gson().fromJson(response, JsonResponse::class.java)
                result
            },
            Response.ErrorListener { it })

// Add the request to the RequestQueue.
        queue.add(stringRequest)
    }

    override fun stopOperations() {

    }
}
