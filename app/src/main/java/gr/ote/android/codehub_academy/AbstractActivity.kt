package gr.ote.android.codehub_academy

import android.os.Bundle
import android.util.Log
import androidx.annotation.Keep
import androidx.appcompat.app.AppCompatActivity
import java.util.*

abstract class AbstractActivity(layoutRes: Int) : AppCompatActivity(layoutRes) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Abstract","onCreate")
        this.resources.configuration.setLocale(Locale("el","GR"))
    }

    override fun onStart() {
        super.onStart()
        Log.d("Abstract","onStart")

    }

    @Keep
    abstract fun initLayout()

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        initLayout()
        Log.d("Abstract","onPostCreate")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Abstract","onResume")

    }

    abstract fun startOperations()
    override fun onPostResume() {
        super.onPostResume()
        startOperations()
        Log.d("Abstract","onPostResume")

    }

    abstract fun stopOperations()
    override fun onPause() {
        stopOperations()
        super.onPause()
        Log.d("Abstract","onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Abstract","onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Abstract","onDestroy")

    }
}