package com.yansp.principeles.demo2.after;



/**
 * Description:
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class RectangleDemo {

    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 调用扩宽方法
        resize(rectangle);
        // 打印长和宽
        printLengthAndWidth(rectangle);

        System.out.println("==========");

        // 创建正方形对象
        Square square = new Square();
        square.setSide(10);
        // 无法调用扩宽方法
//        resize(square);
        // 打印边长
        printLengthAndWidth(square);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
