package com.yansp.pattern.adapter.class_adapter;

/**
 * Description:
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF(String msg) {
        return "电脑读取TF卡中的内容：" + msg;
    }

    @Override
    public void writeTF() {
        System.out.println("电脑输出TF卡中的内容.....");
    }
}
