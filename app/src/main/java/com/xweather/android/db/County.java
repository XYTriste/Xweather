package com.xweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    /*
     * 定义类County用于存放每个县的信息
     * 该类继承自org.litepal.curd.DataSupport类.
     * 表示该类支持使用litepal框架进行数据库存储*/

    private int id;             //记录这个县的id

    private String countyName;  //记录这个县的名称

    private String weatherId;   //记录这个县的天气代号

    private int cityId;         //记录这个县所属市的id

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
