package com.yansp.pattern.adapter.object_adapter;

/**
 * Description: 电脑类
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class Computer {
    // 从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw  new NullPointerException("sd card is not null");
        }
        return sdCard.readSD("数据");
    }
}
