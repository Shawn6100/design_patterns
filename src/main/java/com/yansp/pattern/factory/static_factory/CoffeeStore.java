package com.yansp.pattern.factory.static_factory;

/**
 * Description: 咖啡店类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class CoffeeStore {
    // 点咖啡
    public Coffee orderCoffee(String type) {
        // 通过工厂静态方法获取咖啡对象
        Coffee coffee = CoffeeSimpleFactory.createCoffee(type);

        // 加配料
        coffee.addMike();
        coffee.addSugar();

        return coffee;
    }
}
