package com.yansp.pattern.factory.abstract_factory;

/**
 * Description: 美式风味甜点工厂类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
