package com.codehub.vpigadas.courses.models;

import java.io.Serializable;

public class Monkey implements Serializable {
    private String name;
    private int legs;
    private int ears;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }
}
