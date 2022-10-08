package com.yansp.pattern.factory.factory_method;

/**
 * Description: 咖啡店类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        // 通过工厂创建咖啡对象
        Coffee coffee = factory.createCoffee();
        // 加配料
        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}
