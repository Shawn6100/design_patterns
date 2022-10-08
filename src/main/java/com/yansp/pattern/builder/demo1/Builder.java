package com.yansp.pattern.builder.demo1;

/**
 * Description: 抽象建造者类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public abstract class Builder {
    // 声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    // 构建车架
    public abstract void buildFrame();

    // 构建车座
    public abstract void buildSeat();

    // 构建自行车
    public abstract Bike createBike();
}
