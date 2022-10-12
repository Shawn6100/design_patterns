package com.yansp.pattern.combination;

/**
 * Description: 抽象根节点（菜单组件）
 * Author: 严仕鹏
 * Date: 2022/10/12
 */
public abstract class MenuComponent {

    // 菜单组件的名称
    protected String name;
    // 菜单组件的层级
    protected int level;

    // 添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或者菜单项的名称
    public String getName() {
        return name;
    }

    // 打印菜单名称的方法（包含子菜单和字菜单项）
    public abstract void print();
}
