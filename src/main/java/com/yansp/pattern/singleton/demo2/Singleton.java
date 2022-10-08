package com.yansp.pattern.singleton.demo2;

/**
 * Description: 饿汉式-方式2（静态代码块方式）
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton() {}

    // 2.在成员位置声明类型
    private static Singleton instance;

    // 3.在静态代码块中创建该类的对象
    static {
        instance = new Singleton();
    }

    // 4.对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return instance;
    }
}
