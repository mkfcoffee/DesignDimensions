package com.coffee.designdimensions.model;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class CharacterEntity {
    private String sizeKey;
    private int sizeValue;

    public CharacterEntity(String sizeKey, int sizeValue) {
        this.sizeKey = sizeKey;
        this.sizeValue = sizeValue;
    }


    public String getSizeKey() {
        return sizeKey;
    }

    public void setSizeKey(String sizeKey) {
        this.sizeKey = sizeKey;
    }

    public int getSizeValue() {
        return sizeValue;
    }

    public void setSizeValue(int sizeValue) {
        this.sizeValue = sizeValue;
    }
}
