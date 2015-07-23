package com.alvin.abstractfactory;

/**
 * Created by babyachievement on 2015/7/23.
 */
public class BydFactory extends  CarFactory {
    @Override
    public IWheel createWheel() {
        return new BydWheel();
    }

    @Override
    public IDoor createDoor() {
        return new BydDoor();
    }
}
