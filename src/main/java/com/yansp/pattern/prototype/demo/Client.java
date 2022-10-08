package com.yansp.pattern.prototype.demo;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象
        RealizeType realizeType = new RealizeType();

        // 调用RealizeType类中的clone方法进行对象的克隆
        RealizeType clone = (RealizeType) realizeType.clone();

        System.out.println("原型对象和克隆出来的是否是同一个对象？" + (realizeType == clone));
    }
}
