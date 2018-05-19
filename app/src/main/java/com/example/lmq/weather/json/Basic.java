package com.example.lmq.weather.json;
import com.google.gson.annotations.SerializedName;
/**
 * Created by lmq on 2018/5/5.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
