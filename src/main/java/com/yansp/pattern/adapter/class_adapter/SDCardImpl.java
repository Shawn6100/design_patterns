package com.yansp.pattern.adapter.class_adapter;

/**
 * Description: SD卡实现类
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD(String msg) {
        return "电脑读取SD卡中的内容：" + msg;
    }

    @Override
    public void writeSD() {
        System.out.println("电脑输出SD卡中的内容.....");
    }
}
