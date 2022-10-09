package com.yansp.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description: 获取代理对象的工厂类
 * Author: 严仕鹏
 * Date: 2022/10/9
 */
public class ProxyFactory implements MethodInterceptor {
    // 声明火车站对象
    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject() {
        // 创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象，指定父类
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一定的服务费用(CGLib代理)");
        // 要调用目标对象的方法
        return method.invoke(station, objects);
    }
}
