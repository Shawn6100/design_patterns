package com.yansp.pattern.bridge;

/**
 * Description: 抽象操作系统类（抽象化角色）
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public abstract class OperatingSystem {
    // 声明videoFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
