package com.yansp.pattern.proxy.static_proxy;

/**
 * Description: 代售点类
 * Author: 严仕鹏
 * Date: 2022/10/9
 */
public class ProxyPoint implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
