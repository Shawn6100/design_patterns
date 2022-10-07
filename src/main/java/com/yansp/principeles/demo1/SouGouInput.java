package com.yansp.principeles.demo1;

/**
 * Description: 搜狗输入法
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class SouGouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
