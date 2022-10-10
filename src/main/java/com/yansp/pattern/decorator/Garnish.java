package com.yansp.pattern.decorator;

/**
 * Description: 抽象装饰类
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public abstract class Garnish extends FastFood {

    // 声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
