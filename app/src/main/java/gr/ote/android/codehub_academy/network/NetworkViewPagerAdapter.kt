package gr.ote.android.codehub_academy.network

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class NetworkViewPagerAdapter(fm: FragmentManager,private val listItems: List<String>) :
    FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return NetworkFragment.newInstance(listItems[position])
    }

    override fun getCount(): Int = listItems.count()
}