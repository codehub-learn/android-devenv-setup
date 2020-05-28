package com.codehub.vpigadas.courses.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Monkey2 implements Parcelable {
    private String name;
    private int legs;
    private int ears;

    public Monkey2(){

    }

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


    protected Monkey2(Parcel in) {
        name = in.readString();
        legs = in.readInt();
        ears = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(legs);
        dest.writeInt(ears);
    }

    public static final Creator<Monkey2> CREATOR = new Creator<Monkey2>() {
        @Override
        public Monkey2 createFromParcel(Parcel in) {
            return new Monkey2(in);
        }

        @Override
        public Monkey2[] newArray(int size) {
            return new Monkey2[size];
        }
    };

}
