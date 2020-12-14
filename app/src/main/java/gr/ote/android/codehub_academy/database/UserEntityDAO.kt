package gr.ote.android.codehub_academy.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserEntityDAO {

    @Insert
    fun insert(model: UserEntity2)

    @Insert
    fun insert(model: List<UserEntity2>)

    @Delete
    fun delete(model: UserEntity2)

    @Update
    fun update(model: UserEntity2)

    @Query("SELECT * FROM user_entity")
    fun getAll(): LiveData<List<UserEntity2>>

    @Query("SELECT * FROM user_entity")
    fun getAllAsList(): List<UserEntity2>

    @Query("SELECT * FROM user_entity WHERE user_name like :name LIMIT 1")
    fun get(name: String): UserEntity2?
}