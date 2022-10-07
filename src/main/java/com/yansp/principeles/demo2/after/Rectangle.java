package com.yansp.principeles.demo2.after;

/**
 * Description: 长方形类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class Rectangle implements Quadrilateral {

    private double length;
    private double width;

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
