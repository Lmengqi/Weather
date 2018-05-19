package com.example.lmq.weather.json;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Created by lmq on 2018/5/5.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
