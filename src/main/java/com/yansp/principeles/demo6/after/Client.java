package com.yansp.principeles.demo6.after;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class Client {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color white = new WhiteColor();

        // 红色电动汽车
        Car rec = new ElectricCar(red);
        // 白色汽油汽车
        Car wpc = new PetrolCar(white);

        // 输出
        rec.move();
        wpc.move();
    }
}
