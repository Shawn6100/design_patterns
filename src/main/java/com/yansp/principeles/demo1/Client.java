package com.yansp.principeles.demo1;

/**
 * Description: 客户端
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建搜狗输入法对象
        SouGouInput souGouInput = new SouGouInput();
        // 2.创建皮肤对象
//        DefaultSkin skin = new DefaultSkin();
        ErDingSkin skin = new ErDingSkin();
        // 3.讲皮肤设置到输入法中
        souGouInput.setSkin(skin);
        // 4.显示皮肤
        skin.display();
    }
}
