package com.yansp.pattern.factory.before;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        // 2.点咖啡
        Coffee coffee = store.orderCoffee("american");
        // 3.查看咖啡信息
        System.out.println(coffee.getName());
    }
}
