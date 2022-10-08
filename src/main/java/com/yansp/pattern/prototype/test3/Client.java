package com.yansp.pattern.prototype.test3;

import java.io.*;

/**
 * Description: 场景类（通过序列化方式实现深克隆）
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 创建原型对象
        Citation citation = new Citation();
        // 创建张三学生对象
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Shaw-Yan\\Desktop\\a.txt"));
        // 写对象
        oos.writeObject(citation);
        // 释放资源
        oos.close();

        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Shaw-Yan\\Desktop\\a.txt"));
        // 读对象
        Citation citation1 = (Citation) ois.readObject();
        // 释放资源
        ois.close();
        Student student1 = citation1.getStudent();
        student1.setName("李四");

        citation.show();
        citation1.show();

        /*
            学生对象是否相同？false
            深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
         */
        System.out.println("学生对象是否相同？" + (student == student1));
    }
}
