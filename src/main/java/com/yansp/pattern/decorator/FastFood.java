package com.yansp.pattern.decorator;

/**
 * Description: 抽象构件角色（快餐类）
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public abstract class FastFood {

    private float price;    // 价格
    private String desc;    // 描述

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();
}
