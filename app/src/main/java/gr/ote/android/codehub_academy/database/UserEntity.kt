package gr.ote.android.codehub_academy.database

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class UserEntity {

    @PrimaryKey
    @ColumnInfo(name = "user_name")
    val name: String
    @ColumnInfo(name = "user_age")
    val age: Int
    @ColumnInfo(name = "user_job")
    val job: String?
    @ColumnInfo(name = "user_job")
    val hasDog: Boolean

    constructor() {
        this.name = ""
        this.age = 0
        this.job = ""
        this.hasDog = true
    }
}

@Entity(tableName = "user_entity")
data class UserEntity2(
    @PrimaryKey @ColumnInfo(name = "user_name") val name: String,
    @ColumnInfo(name = "user_age") val age: Int,
    @ColumnInfo(name = "user_job") val job: String?,
    @ColumnInfo(name = "user_has_dog") val hasDog: Boolean
)