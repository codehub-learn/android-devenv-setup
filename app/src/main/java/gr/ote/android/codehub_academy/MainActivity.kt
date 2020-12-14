package gr.ote.android.codehub_academy

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import gr.ote.android.codehub_academy.database.DatabaseAndroidViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AbstractActivity(R.layout.activity_main) {
    private lateinit var viewModel: DatabaseAndroidViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DatabaseAndroidViewModel::class.java)
    }

    override fun initLayout() {
        brn_one.setOnClickListener {
            finish()
        }

        brn_two.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
        }

        viewModel.retrieve()


        when (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            true -> {
            }
            else -> {
            }
        }

    }

    override fun startOperations() {

//        val sharedPref = getSharedPreferences("MainActivity", Context.MODE_PRIVATE)
//        sharedPref.getString("variable", "empty")
//
//        val editor: SharedPreferences.Editor = sharedPref.edit()
//        editor.putString("variable", "value")
//        editor.apply()

        viewModel.observe(this, Observer {
            it
        })
    }

    override fun stopOperations() {
        viewModel.removeObserver(this)
    }

}
