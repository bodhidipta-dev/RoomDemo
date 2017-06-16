package com.android.example.roomdemo.pojo;

import java.util.LinkedList;

/**
 * Created by bodhidipta on 05/06/17.
 */

public class MeteoData {
    private String name = "";
    private String longitude = "";
    private String latitude = "";
    private String syncDate = "";
    private LinkedList<CommonData> commonDataList = null;

    public MeteoData(String name, String longitude, String latitude, String syncDate, LinkedList<CommonData> commonDataList) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.syncDate = syncDate;
        this.commonDataList = commonDataList;
    }

    public MeteoData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public LinkedList<CommonData> getCommonDataList() {
        return commonDataList;
    }

    public void setCommonDataList(LinkedList<CommonData> commonDataList) {
        this.commonDataList = commonDataList;
    }
}
