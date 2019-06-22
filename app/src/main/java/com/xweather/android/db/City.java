package com.xweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    /*
     * 定义类City用于存放每个市的信息
     * 该类继承自org.litepal.curd.DataSupport类.
     * 表示该类支持使用litepal框架进行数据库存储*/

    private int id;                 //存储每个市的id

    private String cityName;        //存储每个市的名称

    private int cityCode;           //存储每个市的代号

    private int provinceId;         //记录这个市所属的省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
