package com.yansp.pattern.singleton.demo3;

/**
 * Description: 懒汉式-方式1（线程不安全）
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton() {}

    // 2.在成员位置声明类型
    private static Singleton instance;

    // 3.对外提供静态方法获取该对象
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
