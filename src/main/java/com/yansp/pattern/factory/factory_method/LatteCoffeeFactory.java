package com.yansp.pattern.factory.factory_method;

/**
 * Description: 拿铁咖啡工厂类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
