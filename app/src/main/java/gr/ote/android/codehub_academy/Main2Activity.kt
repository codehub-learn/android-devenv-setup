package gr.ote.android.codehub_academy

import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import gr.ote.android.codehub_academy.fragments.BlankFragment
import gr.ote.android.codehub_academy.viewmodel.CommonAndroidViewModel
import gr.ote.android.codehub_academy.viewmodel.CommonViewModel
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AbstractActivity(R.layout.activity_main2) {

    private lateinit var androidViewModel: CommonAndroidViewModel
    private lateinit var viewModel: CommonViewModel

    override fun onStart() {
        super.onStart()
        androidViewModel = ViewModelProvider(this).get(CommonAndroidViewModel::class.java)
        viewModel = ViewModelProvider(this).get(CommonViewModel::class.java)
    }

    override fun initLayout() {
        brn_one.setOnClickListener {
            finish()
        }

        brn_one.setOnLongClickListener {
            Toast.makeText(this@Main2Activity, "Btn One long click", Toast.LENGTH_SHORT).show()
            false
        }

        val applicationName = androidViewModel.getApplicationName()
        when (applicationName.isNullOrEmpty()) {
            false -> brn_two.text = applicationName
        }

        brn_two.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@Main2Activity, LoginActivityActivity::class.java)
                startActivity(intent)
            }
        })
        brn_two.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                Toast.makeText(this@Main2Activity, "Btn two long click", Toast.LENGTH_SHORT).show()
                return false
            }
        })

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(
            R.id.frame_layout,
            BlankFragment.newInstance("Monday", "12/14"),
            BlankFragment::class.java.simpleName
        )
//        transaction.replace(
//            R.id.frame_layout,
//            SecondFragment.newInstance(),
//            SecondFragment::class.java.simpleName
//        )
        transaction.commit()
    }

    override fun startOperations() {
        val counter = viewModel.counter

        textView_two.text = counter.toString()

        viewModel.liveCounter.postValue(200)


        viewModel.liveCounter.observe(this, Observer {
            it
        })



    }

    override fun stopOperations() {
        viewModel.liveCounter.removeObservers(this)
    }
}
