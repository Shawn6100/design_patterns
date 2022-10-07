package com.yansp.principeles.demo4.after;

/**
 * Description: 二丁牌安全门（防火、防水、防盗功能）
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class ErDingSafetyDoor implements FireProof, WaterProof, AntiTheft {
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
