package com.yansp.principeles.demo4.before;

/**
 * Description: 二丁牌安全门
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class ErDingSafetyDoor implements SafetyDoor {
    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }
}
