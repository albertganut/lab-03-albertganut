package com.example.listycitylab3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class City implements Serializable {
    private String name;
    private String province;

    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    protected City(Parcel in) {
        name = in.readString();
        province = in.readString();

    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    @NonNull
    public String toString() {
        return name + ", " + province;
    }
}
