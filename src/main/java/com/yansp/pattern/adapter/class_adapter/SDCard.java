package com.yansp.pattern.adapter.class_adapter;

/**
 * Description: SD卡接口
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public interface SDCard {
    String readSD(String msg);

    void writeSD();
}
