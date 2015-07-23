package com.alvin.abstractfactory;

/**
 * Created by haoqiang on 2015/7/23.
 */
public class FordDoor implements IDoor {
    @Override
    public boolean open() {
        System.out.println("Ford Door open");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("Ford Door close");
        return true;
    }
}
