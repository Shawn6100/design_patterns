package com.yansp.pattern.prototype.demo;

/**
 * Description: 具体原型类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("具体的原型对象创建完成");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体的原型对象复制成功");
        return super.clone();
    }
}
