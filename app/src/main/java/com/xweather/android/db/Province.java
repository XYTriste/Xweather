package com.xweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    /*
    * 定义类province用于存放每个省的信息
    * 该类继承自org.litepal.curd.DataSupport类.
    * 表示该类支持使用litepal框架进行数据库存储*/

    private int id;                  //用于存放每个省的序号

    private String provinceName;     //用于存放每个省的名称

    private int provinceCode;        //用于存放省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
