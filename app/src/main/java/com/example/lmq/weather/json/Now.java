package com.example.lmq.weather.json;
import com.google.gson.annotations.SerializedName;

/**
 * Created by lmq on 2018/5/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
