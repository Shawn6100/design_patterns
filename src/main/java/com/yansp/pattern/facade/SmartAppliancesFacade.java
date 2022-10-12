package com.yansp.pattern.facade;

/**
 * Description: 智能音箱类
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public class SmartAppliancesFacade {
    private AirCondition airCondition;
    private Light light;
    private TV tv;

    public SmartAppliancesFacade() {
        airCondition = new AirCondition();
        light = new Light();
        tv = new TV();
    }

    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("我听不懂你在说什么~");
        }
    }

    private void on() {
        airCondition.on();
        light.on();
        tv.on();
    }

    private void off() {
        airCondition.off();
        light.off();
        tv.off();
    }
}
