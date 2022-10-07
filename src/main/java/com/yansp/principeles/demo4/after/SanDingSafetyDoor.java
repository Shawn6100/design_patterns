package com.yansp.principeles.demo4.after;

/**
 * Description: 三丁牌安全门（防火、防盗功能）
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class SanDingSafetyDoor implements AntiTheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
