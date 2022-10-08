package com.yansp.pattern.builder.demo1;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) {
        // 创建指挥者对象
//        Director director = new Director(new MobileBuilder());
        Director director = new Director(new OFOBuilder());
        // 令指挥者对象指挥组装自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
