package com.android.example.roomdemo.room;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import com.android.example.roomdemo.pojo.GraphData;

/**
 * Created by bodhidipta on 06/06/17.
 */
@Entity
public class ColumnInfoEntity {
    @PrimaryKey
    String date_of_week;

    String average_precipitation;
    String temperature_max;
    String temperature_min;
    String windspeed;
    String winddirection;
    String sunshine_time;
    String gust;
    String sun_standtime;
    String sunrise_time;
    String sunset_time;
    String precipitation_probability;
    String rainspot;
    String pictocode;

    public ColumnInfoEntity(String date_of_week, String average_precipitation, String temperature_max, String temperature_min, String windspeed, String winddirection, String sunshine_time, String gust, String sun_standtime, String sunrise_time, String sunset_time, String precipitation_probability, String rainspot, String pictocode) {
        this.date_of_week = date_of_week;
        this.average_precipitation = average_precipitation;
        this.temperature_max = temperature_max;
        this.temperature_min = temperature_min;
        this.windspeed = windspeed;
        this.winddirection = winddirection;
        this.sunshine_time = sunshine_time;
        this.gust = gust;
        this.sun_standtime = sun_standtime;
        this.sunrise_time = sunrise_time;
        this.sunset_time = sunset_time;
        this.precipitation_probability = precipitation_probability;
        this.rainspot = rainspot;
        this.pictocode = pictocode;
    }
}
