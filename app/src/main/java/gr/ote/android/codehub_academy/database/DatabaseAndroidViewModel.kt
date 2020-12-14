package gr.ote.android.codehub_academy.database

import android.app.Application
import androidx.lifecycle.*
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DatabaseAndroidViewModel(application: Application) : AndroidViewModel(application) {
    private var database: AppDatabase =
        Room.databaseBuilder(application, AppDatabase::class.java, "database-name").build()

    private val userDataList: MutableLiveData<List<UserEntity2>> = MutableLiveData()

    fun observe(owner: LifecycleOwner, observer: Observer<List<UserEntity2>>) =
        userDataList.observe(owner, observer)

    fun removeObserver(owner: LifecycleOwner) = userDataList.removeObservers(owner)

    fun retrieve() {
        viewModelScope.launch(Dispatchers.IO) {
            userDataList.postValue(database.getUserDao().getAllAsList())
        }
//        userDataList.postValue(database.getUserDao().getAll().value)

    }
}