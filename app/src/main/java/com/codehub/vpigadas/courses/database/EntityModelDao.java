package com.codehub.vpigadas.courses.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EntityModelDao {

    @Query("SELECT * FROM entityModel")
    List<EntityModel> getAll();

    @Query("SELECT * FROM entityModel LIMIT :number") // get the first {number} rows
    List<EntityModel> get(int number);

    @Query("SELECT * FROM entityModel WHERE name LIKE :name")
    List<EntityModel> get(String name);

    @Query("SELECT * FROM entityModel LIMIT 1")
    EntityModel get();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(EntityModel model);

    @Delete
    void delete(EntityModel model);

}
