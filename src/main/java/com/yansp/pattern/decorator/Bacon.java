package com.yansp.pattern.decorator;

/**
 * Description: 具体装饰类（培根类）
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
