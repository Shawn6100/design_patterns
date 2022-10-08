package com.yansp.pattern.factory.static_factory;

/**
 * Description: 咖啡简单工厂类（静态方法）
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class CoffeeSimpleFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，工厂没有这种咖啡");
        }
        return coffee;
    }
}
