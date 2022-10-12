package com.yansp.pattern.combination;

/**
 * Description: 叶子节点（菜单项类）
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public class MenuItem extends MenuComponent {

    // 构造方法
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        // 打印菜单项的名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(" " + name);
    }
}
