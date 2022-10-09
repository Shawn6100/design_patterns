package com.yansp.pattern.proxy.static_proxy;

/**
 * Description: 场景类，去代售点买火车票
 * Author: 严仕鹏
 * Date: 2022/10/9
 */
public class Client {
    public static void main(String[] args) {
        // 创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 在代售点买票
        proxyPoint.sell();
    }
}
