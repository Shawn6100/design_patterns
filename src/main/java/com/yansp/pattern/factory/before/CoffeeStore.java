package com.yansp.pattern.factory.before;

/**
 * Description: 咖啡店类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class CoffeeStore {
    // 点咖啡
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，本店没有这种咖啡");
        }
        // 加配料
        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}
