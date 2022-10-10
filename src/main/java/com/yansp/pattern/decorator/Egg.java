package com.yansp.pattern.decorator;

/**
 * Description: 具体装饰类（鸡蛋类）
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        // 鸡蛋的价格加上快餐的价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
