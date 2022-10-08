package com.yansp.pattern.singleton.demo5;

/**
 * Description: 懒汉式-方式3（双重检查锁 volatile改进）
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton() {}

    // 2.在成员位置声明类型
    private static volatile Singleton instance;

    // 3.对外提供静态方法获取该对象
    public static Singleton getInstance() {
        // 第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null) {
            synchronized (Singleton.class) {
                // 抢到锁之后再次判断是否为null
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
