package com.codehub.vpigadas.courses.json;

import java.util.List;

public class JsonModel {
    private List<JsonNameModel> names;
    private List<JsonAgeModel> ages;
    private String type;

    public List<JsonNameModel> getNames() {
        return names;
    }

    public void setNames(List<JsonNameModel> names) {
        this.names = names;
    }

    public List<JsonAgeModel> getAges() {
        return ages;
    }

    public void setAges(List<JsonAgeModel> ages) {
        this.ages = ages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
