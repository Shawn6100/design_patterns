package com.yansp.principeles.demo2.before;

/**
 * Description:
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class RectangleDemo {

    public static void main(String[] args) {
        // 创建一个长方形，逐渐增大长方形的宽
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("===========");

        // 创建一个正方形，调用resize方法
        Square square = new Square();
        square.setLength(10);
        resize(square); // 程序死循环
        printLengthAndWidth(square);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长方形的长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
