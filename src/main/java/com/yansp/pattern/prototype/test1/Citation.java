package com.yansp.pattern.prototype.test1;

/**
 * Description: 奖状类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Citation implements Cloneable {
    // 奖状上的姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
