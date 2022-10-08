package com.yansp.pattern.prototype.test3;

import java.io.Serializable;

/**
 * Description: 学生类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Student implements Serializable  {
    // 学生姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
