package com.yansp.principeles.demo3.after;

/**
 * Description: 硬盘接口
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public interface HardDisk {
    //存储数据
    void save(String data);

    //获取数据
    String get();
}
