package com.android.example.roomdemo.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by bodhidipta on 06/06/17.
 */
@Entity
public class GraphEntitiy {
    @PrimaryKey
   String time;

    String entryDate;

    String  precipitation;
    String rainspot;
    String  temperature;
    String  pictocode;
    String  windspeed;
    String  winddirection;
    String  precipitation_probability;
    String  gust;

    public GraphEntitiy(String time, String entryDate, String precipitation, String rainspot, String temperature, String pictocode, String windspeed, String winddirection, String precipitation_probability, String gust) {
        this.time = time;
        this.entryDate = entryDate;
        this.precipitation = precipitation;
        this.rainspot = rainspot;
        this.temperature = temperature;
        this.pictocode = pictocode;
        this.windspeed = windspeed;
        this.winddirection = winddirection;
        this.precipitation_probability = precipitation_probability;
        this.gust = gust;
    }
}
