package com.yansp.pattern.proxy.jdk_proxy;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/9
 */
public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        // 1,创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2,使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        // 3,调用卖票的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        // 让程序一直执行，通过Arthas【阿尔萨斯】查看代理类的结构
//        while(true) {}
    }
}
