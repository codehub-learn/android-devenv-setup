package gr.ote.android.codehub_academy.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class AbstractFragment(layoutRes:Int) : Fragment(layoutRes) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
    }

    abstract fun initLayout()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLayout()
    }

    abstract fun startOperations()

    override fun onResume() {
        super.onResume()
        startOperations()
    }

    abstract fun stopOperations()

    override fun onPause() {
        stopOperations()
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }


}