package gr.ote.android.codehub_academy

import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AbstractActivity(R.layout.activity_main) {

    override fun initLayout() {
        brn_one.setOnClickListener {
            finish()
        }

        brn_two.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun startOperations() {
    }

    override fun stopOperations() {
    }

}
