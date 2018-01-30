package com.coffee.designdimensions.data;

import com.coffee.designdimensions.model.CharacterEntity;
import com.coffee.designdimensions.model.DpEntity;
import com.coffee.designdimensions.model.ImageEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mcoffee on 2018/1/30.
 * Email: mkfcoffee@163.com
 */

public class DataRepository {
    public static List<DpEntity> dpData() {
        List<DpEntity> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(new DpEntity(String.valueOf(i) + "dp", i));
        }
        return list;
    }

    public static List<CharacterEntity> characterData() {
        List<CharacterEntity> list = new ArrayList<>();
        for (int i = 10; i <= 28; i++) {
            list.add(new CharacterEntity(String.valueOf(i) + "sp", i));
        }
        list.add(new CharacterEntity(String.valueOf(50) + "sp", 50));
        return list;
    }

    public static List<ImageEntity> imageData() {
        List<ImageEntity> list = new ArrayList<>();
        list.add(new ImageEntity(12, 12));
        list.add(new ImageEntity(15, 15));
        list.add(new ImageEntity(16, 16));
        list.add(new ImageEntity(20, 20));
        list.add(new ImageEntity(24, 24));
        list.add(new ImageEntity(28, 28));
        list.add(new ImageEntity(32, 32));
        list.add(new ImageEntity(36, 36));
        list.add(new ImageEntity(40, 40));
        list.add(new ImageEntity(48, 48));
        list.add(new ImageEntity(64, 64));
        list.add(new ImageEntity(72, 72));
        list.add(new ImageEntity(78, 78));
        list.add(new ImageEntity(96, 96));
        return list;
    }
}
