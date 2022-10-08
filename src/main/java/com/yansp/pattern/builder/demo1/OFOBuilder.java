package com.yansp.pattern.builder.demo1;

/**
 * Description: 具体构建者类，用来构建OFO单车对象
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class OFOBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("OFO单车—铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("OFO单车—橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
