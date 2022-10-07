package com.yansp.principeles.demo3.after;

/**
 * Description: 因特尔CPU类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class IntelCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
