package com.yansp.pattern.prototype.test1;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1.创建原型对象
        Citation citation = new Citation();
        // 2.克隆奖状对象
        Citation citation1 = citation.clone();
        // 3.设置奖状名字
        citation.setName("张三");
        citation1.setName("李四");
        // 4.调用show方法
        citation.show();
        citation1.show();
    }
}
