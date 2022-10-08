package com.yansp.pattern.singleton.demo9;

import java.lang.reflect.Constructor;

/**
 * Description: 测试使用反射破坏单例模式
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1,获取Singleton的字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        // 2.获取无参构造方法对象
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        // 3.取消访问检查
        constructor.setAccessible(true);
        // 4.创建Singleton对象
        Singleton s1 = constructor.newInstance();
        Singleton s2 = constructor.newInstance();

        // 如果返回的是true，说明并没有破坏单例模式，如果是false，说明破坏了单例模式
        System.out.println(s1 == s2);
    }
}
