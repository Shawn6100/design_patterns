package com.yansp.pattern.factory.abstract_factory;

/**
 * Description: 抽象工厂接口
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public interface DessertFactory {
    // 生产咖啡
    Coffee createCoffee();

    // 生产甜品
    Dessert createDessert();
}
