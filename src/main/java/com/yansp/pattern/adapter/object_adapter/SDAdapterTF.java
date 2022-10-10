package com.yansp.pattern.adapter.object_adapter;

/**
 * Description: 适配器类（TF转接SD）-对象适配器模式
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD(String msg) {
        System.out.println("适配器工作...");
        return tfCard.readTF(msg);
    }

    @Override
    public void writeSD() {
        System.out.println("适配器工作...");
        tfCard.writeTF();
    }
}
