package com.yansp.pattern.factory.abstract_factory;

/**
 * Description: 意式风味甜点工厂类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
