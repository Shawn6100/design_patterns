package com.yansp.pattern.builder.demo2;

/**
 * Description: 使用链式调用版的建造者模式
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainBoard("华硕主板")
                .build();

        System.out.println(phone);
    }
}
