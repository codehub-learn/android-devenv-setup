package gr.ote.android.codehub_academy

import android.content.Intent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AbstractActivity(R.layout.activity_main2) {

    override fun initLayout() {
        brn_one.setOnClickListener {
            finish()
        }

        brn_one.setOnLongClickListener {
            Toast.makeText(this@Main2Activity, "Btn One long click", Toast.LENGTH_SHORT).show()
            false
        }

        brn_two.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@Main2Activity, NetworkActivity::class.java)
                startActivity(intent)
            }
        })
        brn_two.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                Toast.makeText(this@Main2Activity, "Btn two long click", Toast.LENGTH_SHORT).show()
                return false
            }

        })
    }

    override fun startOperations() {

    }

    override fun stopOperations() {

    }
}
