package com.yansp.principeles.demo2.before;

/**
 * Description: 正方形类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class Square extends Rectangle {
    // 正方形的长和宽是相同的
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
