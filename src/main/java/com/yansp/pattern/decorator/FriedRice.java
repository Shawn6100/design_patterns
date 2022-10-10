package com.yansp.pattern.decorator;

/**
 * Description: 具体构件角色（炒饭类）
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
