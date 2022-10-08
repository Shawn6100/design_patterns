package com.yansp.pattern.singleton.demo1;

/**
 * Description: 饿汉式-方式1（静态变量方式）
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton() {}

    // 2.在本类中创建本类对象
    private static Singleton instance = new Singleton();

    // 3.对外提供静态方法获取对象
    public static Singleton getInstance() {
        return instance;
    }
}
