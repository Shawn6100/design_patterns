package com.yansp.principeles.demo6.after;

/**
 * Description: 电动型汽车类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class ElectricCar extends Car {

    // 给汽车设置颜色
    public ElectricCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println(color.getName() + "的电动型汽车移动");
    }
}
