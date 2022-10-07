package com.yansp.principeles.demo3.before;

/**
 * Description: 场景类
 * Author: 严仕鹏
 * Date: 2022/10/7
 */
public class ComputerDemo {
    public static void main(String[] args) {
        // 创建组件对象
        IntelCpu cpu = new IntelCpu();
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        KingstonMemory memory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();

        // 组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        // 运行计算机
        computer.run();
    }
}
