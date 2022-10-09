package com.yansp.pattern.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * Description: 获取代理对象的工厂类（代理类也实现了对应的接口）
 * Author: 严仕鹏
 * Date: 2022/10/9
 */
public class ProxyFactory {
    // 声明目标对象
    private TrainStation station = new TrainStation();

    // 获取代理对象的方法
    public SellTickets getProxyObject() {
        /*
            返回代理对象
            ClassLoader loader：类加载器，用于加载代理类。可以通过目标对象获取类加载器
            Class<?>[] interfaces：代理类实现的接口的字节码对象
            InvocationHandler h：代理对象的调用处理程序
         */
        return (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                /*
                    Object proxy：代理对象。和本对象是同一个对象，在invoke方法中基本不用
                    Method method：对接口中的方法进行封装的method对象
                    Object[] args：调用方法的实际参数
                    返回值： 方法的返回值。
                    这里使用lambda表达式
                 */
                (proxy, method, args) -> {
                    System.out.println("代售点收取一定的服务费用（jdk动态代理）");
                    // 执行目标对象的方法
                    return method.invoke(station, args);
                }
        );
    }
}
