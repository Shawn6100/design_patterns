package com.yansp.principeles.demo2.after;

/**
 * Description: 正方形类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class Square implements Quadrilateral {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
