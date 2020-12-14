package gr.ote.android.codehub_academy.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserEntity2::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getUserDao(): UserEntityDAO
}