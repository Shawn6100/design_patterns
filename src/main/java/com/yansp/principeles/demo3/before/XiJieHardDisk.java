package com.yansp.principeles.demo3.before;

/**
 * Description: 希捷硬盘
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class XiJieHardDisk {
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}
