package com.android.example.roomdemo.pojo;

/**
 * Created by bodhidipta on 05/06/17.
 */

public class GraphData {
    private String time = "";
    private String precipitation = "";
    private String rainspot = "";
    private String temperature = "";
    private String pictocode = "";
    private String windspeed = "";
    private String winddirection = "";
    private String precipitation_probability = "";
    private String gust = "";

    public GraphData(String time, String precipitation, String rainspot, String temperature, String pictocode, String windspeed, String winddirection, String precipitation_probability, String gust) {
        this.time = time;
        this.precipitation = precipitation;
        this.rainspot = rainspot;
        this.temperature = temperature;
        this.pictocode = pictocode;
        this.windspeed = windspeed;
        this.winddirection = winddirection;
        this.precipitation_probability = precipitation_probability;
        this.gust = gust;
    }

    public GraphData() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getRainspot() {
        return rainspot;
    }

    public void setRainspot(String rainspot) {
        this.rainspot = rainspot;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPictocode() {
        return pictocode;
    }

    public void setPictocode(String pictocode) {
        this.pictocode = pictocode;
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

    public String getPrecipitation_probability() {
        return precipitation_probability;
    }

    public void setPrecipitation_probability(String precipitation_probability) {
        this.precipitation_probability = precipitation_probability;
    }

    public String getGust() {
        return gust;
    }

    public void setGust(String gust) {
        this.gust = gust;
    }
}
