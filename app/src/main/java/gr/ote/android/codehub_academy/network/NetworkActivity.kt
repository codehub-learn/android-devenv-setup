package gr.ote.android.codehub_academy.network

import android.view.View
import com.android.volley.toolbox.Volley
import gr.ote.android.codehub_academy.AbstractActivity
import gr.ote.android.codehub_academy.R
import gr.ote.android.codehub_academy.json.JsonResponse
import kotlinx.android.synthetic.main.activity_network.*

class NetworkActivity : AbstractActivity(
    R.layout.activity_network
) {

    override fun initLayout() {}

    override fun startOperations() {

        ApiClient().getProgram(object : CallbackInterface {
            override fun onSuccess(data: JsonResponse) {
                data
                progressBar.visibility = View.GONE
//                recyclerView.visibility = View.VISIBLE
//                recyclerView.adapter =
//                    NetworkListAdapter().also { adapter -> adapter.submitList(data.channels.map { item -> item.channelName }) }

                val list = data.channels.map { it.channelName }

                viewPager.adapter = NetworkViewPagerAdapter(supportFragmentManager, list)

            }

            override fun onEmptyResponse() {
                true
            }

            override fun onServerError(exception: Exception) {
                exception
            }

            override fun onFailed(exception: Exception) {
                exception
            }

        })

    }

    override fun stopOperations() {

    }

    private fun useVolley() {
        val queue = Volley.newRequestQueue(this)
//        val url = "https://tv-zapping.herokuapp.com/v2/tv"
//
//// Request a string response from the provided URL.
//        val stringRequest = StringRequest(Request.Method.GET, url,
//            Response.Listener<String> { response ->
//                // Display the first 500 characters of the response string.
//                response
//               val result =  Gson().fromJson(response, JsonResponse::class.java)
//                result
//            },
//            Response.ErrorListener { it })
//
//// Add the request to the RequestQueue.
//        queue.add(stringRequest)
    }
}
