package com.yansp.pattern.proxy.static_proxy;

/**
 * Description: 火车站类
 * Author: 严仕鹏
 * Date: 2022/10/9
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
