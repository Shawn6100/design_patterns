package com.yansp.pattern.bridge;

/**
 * Description: rmvb视频文件（具体的实现化角色）
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public class RMVBFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
