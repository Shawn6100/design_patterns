package com.yansp.pattern.builder.demo2;

/**
 * Description: 手机类
 * Author: 严仕鹏
 * Date: 2022/10/8
 */
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    // 私有构造方法（传入静态内部类）
    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }

    // 静态内部类—建造者
    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

        // 返回Builder本身可以实现链式调用
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }
        public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        // 使用建造者创建Phone对象
        public Phone build() {
            return new Phone(this);
        }
    }
}
