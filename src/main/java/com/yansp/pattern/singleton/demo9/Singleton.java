package com.yansp.pattern.singleton.demo9;

/**
 * Description: 防止反射方式破解单例模式
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Singleton {

    // 0.用于判断是否创建过对象
    private static boolean flag = false;

    // 1.私有构造方法
    private Singleton() {
        synchronized (Singleton.class) {
            // 判断flag的值是否是true，如果是true，说明非第一次访问，直接抛一个异常
            if (flag) {
                throw new RuntimeException(Singleton.class.getName() + "类不能创建多个实例");
            }
            // 将flag的值设置为true
            flag = true;
        }
    }

    // 2.定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3.对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
