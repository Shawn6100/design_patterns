package com.yansp.principeles.demo6.after;

/**
 * Description: 汽油型汽车类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class PetrolCar extends Car {

    // 给汽车设置颜色
    public PetrolCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println(color.getName() + "的汽油型汽车移动");
    }
}
