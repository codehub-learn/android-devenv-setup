package gr.ote.android.codehub_academy.fragments

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import gr.ote.android.codehub_academy.R
import gr.ote.android.codehub_academy.viewmodel.CommonAndroidViewModel
import gr.ote.android.codehub_academy.viewmodel.CommonViewModel
import kotlinx.android.synthetic.main.fragment_blank.*

class BlankFragment : AbstractFragment(R.layout.fragment_blank) {
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var androidViewModel: CommonAndroidViewModel
    private lateinit var viewModel: CommonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        when (val act = activity) {
            null -> {
                androidViewModel = ViewModelProvider(this).get(CommonAndroidViewModel::class.java)
                viewModel = ViewModelProvider(this).get(CommonViewModel::class.java)
            }
            else -> {
                androidViewModel = ViewModelProvider(act).get(CommonAndroidViewModel::class.java)
                viewModel = ViewModelProvider(act).get(CommonViewModel::class.java)
            }
        }
    }

    override fun initLayout() {
        viewModel.counter = 100

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun startOperations() {
        viewModel.liveCounter.observe(this, Observer { value ->
            when (value == 200) {
                true -> blank_img.visibility = View.VISIBLE
                false -> blank_img.visibility = View.GONE
            }
        })
    }

    override fun stopOperations() {
        viewModel.liveCounter.removeObservers(this)
    }

    companion object {
        const val ARG_PARAM1 = "param1"
        const val ARG_PARAM2 = "param2"

        @JvmStatic
        fun newInstance(param1: String, param2: String): BlankFragment {
            val instance = BlankFragment()
            val parameters = Bundle()
            parameters.putString(ARG_PARAM1, param1)
            parameters.putString(ARG_PARAM2, param2)

            instance.arguments = parameters

            return instance
        }
    }
}
