package com.yansp.pattern.proxy.cglib_proxy;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/9
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        //调用代理对象中的sell方法卖票
        proxyObject.sell();
    }
}
