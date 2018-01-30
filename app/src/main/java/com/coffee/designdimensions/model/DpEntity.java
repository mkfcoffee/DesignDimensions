package com.coffee.designdimensions.model;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class DpEntity {
    private String dpKey;
    private int dpValue;

    public DpEntity(String dpKey, int dpValue) {
        this.dpKey = dpKey;
        this.dpValue = dpValue;
    }

    public String getDpKey() {
        return dpKey;
    }

    public void setDpKey(String dpKey) {
        this.dpKey = dpKey;
    }

    public int getDpValue() {
        return dpValue;
    }

    public void setDpValue(int dpValue) {
        this.dpValue = dpValue;
    }
}
