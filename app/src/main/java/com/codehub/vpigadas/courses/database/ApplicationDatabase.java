package com.codehub.vpigadas.courses.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {EntityModel.class},exportSchema = false, version = 1)
public abstract class ApplicationDatabase extends RoomDatabase {
    private static ApplicationDatabase instance;

    public static ApplicationDatabase getInstance(Context context) {
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),ApplicationDatabase.class,"PfAcademy.db")
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return instance;
    }


    public abstract EntityModelDao getEntityDaoModel();
}
