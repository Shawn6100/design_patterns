package com.yansp.pattern.prototype.test2;

/**
 * Description: 奖状类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Citation implements Cloneable {
    // 获得奖状的学生
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
