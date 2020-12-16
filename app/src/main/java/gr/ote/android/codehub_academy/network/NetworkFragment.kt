package gr.ote.android.codehub_academy.network

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import gr.ote.android.codehub_academy.R
import kotlinx.android.synthetic.main.fragment_network.*

private const val ARG_PARAM_NAME = "ARG_PARAM_NAME"

class NetworkFragment : Fragment() {
    private var param: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param = it.getString(ARG_PARAM_NAME)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_network, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        net_frag_title.text = param
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            NetworkFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM_NAME, param1)
                }
            }
    }
}
