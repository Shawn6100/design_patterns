package com.yansp.pattern.decorator;

/**
 * Description: 具体构件角色（炒面类）
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
