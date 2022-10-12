package com.yansp.pattern.bridge;

/**
 * Description: 扩展的抽象化角色（mac操作系统）
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
