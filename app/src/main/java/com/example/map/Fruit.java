package com.example.map;

/**
 * Created by lijianfu on 2017/3/29.
 * 定义一个水果实体类
 */
public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "水果名：" + name +"," + "ID：" + imageId;
    }
}
