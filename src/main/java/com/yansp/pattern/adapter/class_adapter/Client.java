package com.yansp.pattern.adapter.class_adapter;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("===============");
        // 使用该电脑读取TF卡中的数据
        // 定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
