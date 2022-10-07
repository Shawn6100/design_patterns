package com.yansp.principeles.demo4.after;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class Client {
    public static void main(String[] args) {
        // 创建二丁牌安全门
        ErDingSafetyDoor door1 = new ErDingSafetyDoor();
        door1.fireProof();
        door1.waterProof();
        door1.antiTheft();

        System.out.println("===========");

        // 创建三丁牌安全门
        SanDingSafetyDoor door2 = new SanDingSafetyDoor();
        door2.fireProof();
        door2.antiTheft();
    }
}
