package com.yansp.pattern.factory.factory_method;

/**
 * Description: 美式咖啡工厂类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
