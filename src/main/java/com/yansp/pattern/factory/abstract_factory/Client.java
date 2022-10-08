package com.yansp.pattern.factory.abstract_factory;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) {
        // 创建工厂
//        DessertFactory factory = new ItalyDessertFactory(); // 意式风味
        DessertFactory factory = new AmericanDessertFactory();  // 美式风味

        // 获取甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
