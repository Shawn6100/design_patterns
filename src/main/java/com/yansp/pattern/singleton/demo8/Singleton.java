package com.yansp.pattern.singleton.demo8;

import java.io.Serializable;

/**
 * Description: 防止序列化、反序列方式破解单例模式
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Singleton implements Serializable {
    // 1.私有构造方法
    private Singleton() {}

    // 2.定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3.对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return Singleton.SingletonHolder.INSTANCE;
    }

    // 解决序列化反序列化破解单例模式问题
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
