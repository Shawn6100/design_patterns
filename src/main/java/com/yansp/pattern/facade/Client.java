package com.yansp.pattern.facade;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public class Client {
    public static void main(String[] args) {
        // 创建智能音响对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        // 控制家电
        facade.say("打开家电");

        System.out.println("==================");

        facade.say("关闭");
    }
}
