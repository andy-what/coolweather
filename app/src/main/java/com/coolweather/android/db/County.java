package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by arch on 2018/3/8.
 */

public class County extends DataSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public County() {
    }

    public County(String countyName, String weatherId, int cityId) {
        this.countyName = countyName;
        this.weatherId = weatherId;
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
