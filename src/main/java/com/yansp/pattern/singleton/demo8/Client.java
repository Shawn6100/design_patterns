package com.yansp.pattern.singleton.demo8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Description: 测试使用序列化破坏单例模式
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Client {
    public static void main(String[] args) throws Exception {
        writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();
    }

    //从文件读取数据（对象）
    public static void readObjectFromFile() throws Exception {
        // 1,创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Shaw-Yan\\Desktop\\a.txt"));
        // 2,读取对象
        Singleton instance = (Singleton) ois.readObject();

        /*
            Singleton类中未添加readResolve方法时，获取到的是不同的对象，破坏了单例模式：
                com.yansp.pattern.singleton.demo8.Singleton@312b1dae
                com.yansp.pattern.singleton.demo8.Singleton@7530d0a
            添加readResolve方法后，获取到的是相同的对象：
                com.yansp.pattern.singleton.demo8.Singleton@3764951d
                com.yansp.pattern.singleton.demo8.Singleton@3764951d
         */
        System.out.println(instance);

        // 释放资源
        ois.close();
    }

    //向文件中写数据（对象）
    public static void writeObjectToFile() throws Exception {
        // 1,获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 2,创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Shaw-Yan\\Desktop\\a.txt"));
        // 3,写对象
        oos.writeObject(instance);
        // 4,释放资源
        oos.close();
    }
}
