package com.yansp.principeles.demo6.after;

/**
 * Description: 抽象汽车类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public abstract class Car {
    // 聚合颜色接口
    protected Color color;

    public Car(Color color) {
        this.color = color;
    }

    // 定义抽象移动方法
    public abstract void move();
}
