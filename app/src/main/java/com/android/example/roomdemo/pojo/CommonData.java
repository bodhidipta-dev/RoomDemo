package com.android.example.roomdemo.pojo;

import java.util.LinkedList;

/**
 * Created by bodhidipta on 05/06/17.
 */

public class CommonData {
    private String date_of_week = "";
    private String average_precipitation = "";
    private String temperature_max = "";
    private String temperature_min = "";
    private String windspeed = "";
    private String winddirection = "";
    private String sunshine_time = "";
    private String gust = "";
    private String sun_standtime = "";
    private String sunrise_time = "";
    private String sunset_time = "";
    private String precipitation_probability = "";
    private String rainspot = "";
    private String pictocode = "";
    private LinkedList<GraphData> graphDataHourList = null;


    public CommonData(String date_of_week, String average_precipitation, String temperature_max, String temperature_min, String windspeed, String winddirection, String sunshine_time, String gust, String sun_standtime, String sunrise_time, String sunset_time, String precipitation_probability, String rainspot, String pictocode, LinkedList<GraphData> graphDataHourList) {
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
        this.graphDataHourList = graphDataHourList;
    }

    public CommonData() {
    }

    public String getDate_of_week() {
        return date_of_week;
    }

    public void setDate_of_week(String date_of_week) {
        this.date_of_week = date_of_week;
    }

    public String getAverage_precipitation() {
        return average_precipitation;
    }

    public void setAverage_precipitation(String average_precipitation) {
        this.average_precipitation = average_precipitation;
    }

    public String getTemperature_max() {
        return temperature_max;
    }

    public void setTemperature_max(String temperature_max) {
        this.temperature_max = temperature_max;
    }

    public String getTemperature_min() {
        return temperature_min;
    }

    public void setTemperature_min(String temperature_min) {
        this.temperature_min = temperature_min;
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }

    public String getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(String winddirection) {
        this.winddirection = winddirection;
    }

    public String getSunshine_time() {
        return sunshine_time;
    }

    public void setSunshine_time(String sunshine_time) {
        this.sunshine_time = sunshine_time;
    }

    public String getGust() {
        return gust;
    }

    public void setGust(String gust) {
        this.gust = gust;
    }

    public String getSun_standtime() {
        return sun_standtime;
    }

    public void setSun_standtime(String sun_standtime) {
        this.sun_standtime = sun_standtime;
    }

    public String getSunrise_time() {
        return sunrise_time;
    }

    public void setSunrise_time(String sunrise_time) {
        this.sunrise_time = sunrise_time;
    }

    public String getSunset_time() {
        return sunset_time;
    }

    public void setSunset_time(String sunset_time) {
        this.sunset_time = sunset_time;
    }

    public String getPrecipitation_probability() {
        return precipitation_probability;
    }

    public void setPrecipitation_probability(String precipitation_probability) {
        this.precipitation_probability = precipitation_probability;
    }

    public String getRainspot() {
        return rainspot;
    }

    public void setRainspot(String rainspot) {
        this.rainspot = rainspot;
    }

    public String getPictocode() {
        return pictocode;
    }

    public void setPictocode(String pictocode) {
        this.pictocode = pictocode;
    }

    public LinkedList<GraphData> getGraphDataHourList() {
        return graphDataHourList;
    }

    public void setGraphDataHourList(LinkedList<GraphData> graphDataHourList) {
        this.graphDataHourList = graphDataHourList;
    }
}
