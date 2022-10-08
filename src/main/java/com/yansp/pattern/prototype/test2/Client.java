package com.yansp.pattern.prototype.test2;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1.创建原型对象
        Citation citation = new Citation();

        // 2.创建学生对象
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        // 3.克隆原型对象
        Citation citation1 = citation.clone();
        // 4.获取克隆对象中的学生对象
        Student student1 = citation1.getStudent();
        // 5.修改学生姓名
        student1.setName("李四");

        citation.show();
        citation1.show();

        /*
            学生对象是否相同？true
            浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，
                对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
         */
        System.out.println("学生对象是否相同？" + (student == student1));
    }
}
