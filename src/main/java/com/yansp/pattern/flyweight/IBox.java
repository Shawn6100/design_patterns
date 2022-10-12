package com.yansp.pattern.flyweight;

/**
 * Description: 具体享元角色（IBox）
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public class IBox extends AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}
