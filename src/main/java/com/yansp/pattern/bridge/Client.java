package com.yansp.pattern.bridge;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public class Client {
    public static void main(String[] args) {
        // 创建mac系统对象
        OperatingSystem system = new Mac(new AVIFile());
        // 使用操作系统播放视频文件
        system.play("战狼3");
    }
}
