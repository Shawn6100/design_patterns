package com.yansp.principeles.demo6.before;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class Client {
    public static void main(String[] args) {
        // 子类繁杂而多，类爆炸
        Car redPetrolCar = new RedPetrolCar();
        Car whitePetrolCar = new WhitePetrolCar();
        Car redElectricCar = new RedElectricCar();
        Car whiteElectricCar = new WhiteElectricCar();
        redPetrolCar.move();
        whitePetrolCar.move();
        redElectricCar.move();
        whiteElectricCar.move();
    }
}
