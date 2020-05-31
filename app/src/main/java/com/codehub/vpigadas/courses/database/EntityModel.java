package com.codehub.vpigadas.courses.database;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "entityModel")
public class EntityModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "value")
    private String value;
    @ColumnInfo(name = "number")
    private int number;

    public EntityModel(String name,String value,int number){
        this.name = name;
        this.value = value;
        this.number = number;
    }

//    public EntityModel(String _name,String _value,int _number){
//        name = _name;
//        value = _value;
//        number = _number;
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "EntityModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", number=" + number +
                '}';
    }
}
