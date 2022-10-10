package com.yansp.pattern.adapter.class_adapter;

/**
 * Description: 适配器类（TF转接SD）-类适配器模式
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD(String msg) {
        System.out.println("转接器工作");
        return readTF(msg);
    }

    @Override
    public void writeSD() {
        System.out.println("转接器工作");
        writeTF();
    }
}
