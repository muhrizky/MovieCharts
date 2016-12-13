package com.example.muhammadrizqi.moviecharts;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Muhammad Rizqi on 04/12/2016.
 */

public class ObjectTrailer {
    @SerializedName("results")
    List<DataTrailer> results;

    public class DataTrailer {
        @SerializedName("name")
        public String name;

        @SerializedName("key")
        public String key;

        @SerializedName("type")
        public String type;
    }
}
