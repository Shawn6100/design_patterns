package com.yansp.pattern.factory.abstract_factory;

/**
 * Description: 抽象咖啡类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public abstract class Coffee {

    public abstract String getName();

    // 加奶
    public void addMike() {
        System.out.println("加奶");
    }

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }
}
