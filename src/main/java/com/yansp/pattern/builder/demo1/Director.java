package com.yansp.pattern.builder.demo1;

/**
 * Description: 指挥者类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
