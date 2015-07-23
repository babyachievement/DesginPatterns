package com.alvin.abstractfactory;

/**
 * Created by babyachievement on 2015/7/23.
 */
public class BydDoor implements IDoor{
    @Override
    public boolean open() {
        System.out.println("打开比亚迪车门");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("关闭比亚迪车门");
        return true;
    }
}
