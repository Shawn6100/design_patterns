package com.yansp.pattern.flyweight;

import java.util.HashMap;

/**
 * Description: 工厂类（单例模式）
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    public BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    //提供一个方法获取该工厂类对象
    public static BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    //根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
