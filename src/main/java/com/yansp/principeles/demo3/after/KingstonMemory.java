package com.yansp.principeles.demo3.after;

/**
 * Description: 金士顿内存条类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("使用金士顿内存条");
    }
}
