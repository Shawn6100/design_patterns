package com.yansp.pattern.adapter.object_adapter;

/**
 * Description: TF卡接口
 * Author: 严仕鹏
 * Date: 2022/10/10
 */
public interface TFCard {
    String readTF(String msg);

    void writeTF();
}
