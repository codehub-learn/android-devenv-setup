package com.codehub.vpigadas.courses.models;

import java.util.List;

public class Animals {

    private int number;
    private List<Monkey> animals;
    private List<Monkey2> animals2;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Monkey> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Monkey> animals) {
        this.animals = animals;
    }

    public List<Monkey2> getAnimals2() {
        return animals2;
    }

    public void setAnimals2(List<Monkey2> animals2) {
        this.animals2 = animals2;
    }
}
