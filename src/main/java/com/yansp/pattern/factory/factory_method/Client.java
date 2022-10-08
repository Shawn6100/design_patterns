package com.yansp.pattern.factory.factory_method;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        // 传入工厂对象
        CoffeeFactory factory = new LatteCoffeeFactory();
//        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        // 点咖啡
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
