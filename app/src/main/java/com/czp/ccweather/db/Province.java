package com.czp.ccweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by C515 on 2017/5/18.
 */
public class Province extends DataSupport {
    private int id;
    private  String provinceName;
    private int provindeCode;
    public int getId(){
        return  id;
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
        return provindeCode;
    }

    public void setProvinceCode(int provindeCode) {
        this.provindeCode = provindeCode;
    }
}
