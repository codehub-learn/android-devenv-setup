package com.codehub.vpigadas.courses.models;

import com.bumptech.glide.load.model.Model;
import com.google.gson.Gson;

import java.io.Serializable;

public class Models implements Serializable {
    private String demo;
    private String step;

    public Models() {
        demo = "10";
        step = "Demo";
    }

    public String transformToString() {
        return new Gson().toJson(this);
    }

    public Model transformToModel(String data) {
        return new Gson().fromJson(data, Model.class);
    }
}
