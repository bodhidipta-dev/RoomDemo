package com.android.example.roomdemo;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.android.example.roomdemo.pojo.CommonData;
import com.android.example.roomdemo.pojo.GraphData;
import com.android.example.roomdemo.pojo.MeteoData;
import com.android.example.roomdemo.room.ColumnInfoEntity;
import com.android.example.roomdemo.room.GraphEntitiy;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.LinkedList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by bodhidipta on 05/06/17.
 */

public class MeteoViewMode extends AndroidViewModel {
    String url = "https://core.uaveditor.com/api/weather/name-coords?name=Cham&lat=47.1820679&lng=8.457383499999999";
    MutableLiveData<WheatherData> mutableLiveData = new MutableLiveData<>();
    Context mContext;
    WheatherData dataINstance;

    public MeteoViewMode(Application application) {
        super(application);
        mContext = application;
        dataINstance = WheatherData.get(mContext);
    }

    public WheatherData getLiveDataObserver() {
        return dataINstance;

    }



    public void loadData() {
        new AsyncTask<Void, Void, MeteoData>() {
            @Override
            protected MeteoData doInBackground(Void... params) {
                try {
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()
                            .url(url)
                            .get()
                            .build();
                    Response response = client.newCall(request).execute();
                    String res = response.body().string();

                    JSONObject mainJsonObject = new JSONObject(res);
                    MeteoData meteoData = new MeteoData();

                    meteoData.setName(mainJsonObject.getString("name"));
                    meteoData.setLatitude(mainJsonObject.getString("latitude"));
                    meteoData.setLongitude(mainJsonObject.getString("longitude"));
                    meteoData.setSyncDate(mainJsonObject.getString("syncDate"));

                    LinkedList<CommonData> commonDatas = new LinkedList<CommonData>();

                    JSONArray weekDataAr = mainJsonObject.getJSONArray("week_data");
                    for (int i = 0; i < weekDataAr.length(); i++) {
                        JSONObject innerObject = weekDataAr.getJSONObject(i);
                        CommonData cmnData = new CommonData();
                        cmnData.setDate_of_week(innerObject.getJSONObject("commonData").getString("date_of_week"));
                        cmnData.setAverage_precipitation(innerObject.getJSONObject("commonData").getString("average_precipitation"));
                        cmnData.setTemperature_max(innerObject.getJSONObject("commonData").getString("temperature_max"));
                        cmnData.setTemperature_min(innerObject.getJSONObject("commonData").getString("temperature_min"));
                        cmnData.setWindspeed(innerObject.getJSONObject("commonData").getString("windspeed"));
                        cmnData.setWinddirection(innerObject.getJSONObject("commonData").getString("winddirection"));
                        cmnData.setSunshine_time(innerObject.getJSONObject("commonData").getString("sunshine_time"));
                        cmnData.setGust(innerObject.getJSONObject("commonData").getString("gust"));
                        cmnData.setSun_standtime(innerObject.getJSONObject("commonData").getString("sun_standtime"));
                        cmnData.setSunrise_time(innerObject.getJSONObject("commonData").getString("sunrise_time"));
                        cmnData.setSunset_time(innerObject.getJSONObject("commonData").getString("sunset_time"));
                        cmnData.setPrecipitation_probability(innerObject.getJSONObject("commonData").getString("precipitation_probability"));
                        cmnData.setRainspot(innerObject.getJSONObject("commonData").getString("rainspot"));
                        cmnData.setPictocode(innerObject.getJSONObject("commonData").getString("pictocode"));

                        JSONArray graphArr = innerObject.getJSONArray("graph_data");


                        LinkedList<GraphData> graphDataList = new LinkedList<GraphData>();
                        for (int j = 0; j < graphArr.length(); j++) {
                            GraphData graphData = new GraphData();
                            graphData.setTime(graphArr.getJSONObject(j).getString("time"));

                            graphData.setPrecipitation(graphArr.getJSONObject(j).getString("precipitation"));
                            graphData.setRainspot(graphArr.getJSONObject(j).getString("rainspot"));
                            graphData.setTemperature(graphArr.getJSONObject(j).getString("temperature"));
                            graphData.setPictocode(graphArr.getJSONObject(j).getString("pictocode"));
                            graphData.setWindspeed(graphArr.getJSONObject(j).getString("windspeed"));
                            graphData.setWinddirection(graphArr.getJSONObject(j).getString("winddirection"));
                            graphData.setPrecipitation_probability(graphArr.getJSONObject(j).getString("precipitation_probability"));
                            graphData.setGust(graphArr.getJSONObject(j).getString("gust"));

                            graphDataList.add(graphData);
                            AppUtil.getInstance().getDatabaseInstance().wheatherDao().insertGraphData(new GraphEntitiy(
                                    graphArr.getJSONObject(j).getString("time"),
                                    innerObject.getJSONObject("commonData").getString("date_of_week"),
                                    graphArr.getJSONObject(j).getString("precipitation"),
                                    graphArr.getJSONObject(j).getString("rainspot"),
                                    graphArr.getJSONObject(j).getString("temperature"),
                                    graphArr.getJSONObject(j).getString("pictocode"),
                                    graphArr.getJSONObject(j).getString("windspeed"),
                                    graphArr.getJSONObject(j).getString("winddirection"),
                                    graphArr.getJSONObject(j).getString("precipitation_probability"),
                                    graphArr.getJSONObject(j).getString("gust")

                            ));
                        }

                        cmnData.setGraphDataHourList(graphDataList);
                        commonDatas.add(cmnData);


                        AppUtil.getInstance().getDatabaseInstance().wheatherDao().inserWheather(new ColumnInfoEntity(
                                innerObject.getJSONObject("commonData").getString("date_of_week"),
                                innerObject.getJSONObject("commonData").getString("average_precipitation"),
                                innerObject.getJSONObject("commonData").getString("temperature_max"),
                                innerObject.getJSONObject("commonData").getString("temperature_min"),
                                innerObject.getJSONObject("commonData").getString("windspeed"),
                                innerObject.getJSONObject("commonData").getString("winddirection"),
                                innerObject.getJSONObject("commonData").getString("sunshine_time"),
                                innerObject.getJSONObject("commonData").getString("gust"),
                                innerObject.getJSONObject("commonData").getString("sun_standtime"),
                                innerObject.getJSONObject("commonData").getString("sunrise_time"),
                                innerObject.getJSONObject("commonData").getString("sunset_time"),
                                innerObject.getJSONObject("commonData").getString("precipitation_probability"),
                                innerObject.getJSONObject("commonData").getString("rainspot"),
                                innerObject.getJSONObject("commonData").getString("pictocode")
                        ));

                    }

                    meteoData.setCommonDataList(commonDatas);



                    int size=AppUtil.getInstance().getDatabaseInstance().wheatherDao().getAllInfor().length;
                    Log.i("LFC_AWARE", "On database inserted size is :: "+size);

                    return meteoData;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }

            }

            @Override
            protected void onPostExecute(MeteoData meteoData) {
                super.onPostExecute(meteoData);

                dataINstance.setValue(meteoData);
                mutableLiveData.setValue(dataINstance);




            }
        }.execute();
    }
}
