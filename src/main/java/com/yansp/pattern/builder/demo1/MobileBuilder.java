package com.yansp.pattern.builder.demo1;

/**
 * Description: 具体构建者类，用来构建摩拜单车对象
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜单车—碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜单车—真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
