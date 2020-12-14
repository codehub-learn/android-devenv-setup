package gr.ote.android.codehub_academy.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import gr.ote.android.codehub_academy.R

class CommonViewModel : ViewModel() {
    var counter: Int = 0
    val liveCounter: MutableLiveData<Int> = MutableLiveData()
}

class CommonAndroidViewModel(application: Application) : AndroidViewModel(application) {

    fun getApplicationName() = getApplication<Application>().getString(R.string.app_name)

}