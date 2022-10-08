package com.yansp.pattern.singleton.demo4;

/**
 * Description: 懒汉式-方式2（线程安全）
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton() {}

    // 2.在成员位置声明类型
    private static Singleton instance;

    // 3.对外提供静态方法获取该对象（加锁）
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
