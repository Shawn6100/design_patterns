package com.yansp.principeles.demo4.before;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class Client {
    public static void main(String[] args) {
        ErDingSafetyDoor door = new ErDingSafetyDoor();
        door.fireProof();
        door.waterProof();
        door.antiTheft();
    }
}
