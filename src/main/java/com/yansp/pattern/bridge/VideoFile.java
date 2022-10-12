package com.yansp.pattern.bridge;

/**
 * Description: 视频文件（实现化角色）
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public interface VideoFile {
    // 解码功能
    void decode(String fileName);
}
