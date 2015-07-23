package com.alvin.abstractfactory;

/**
 * Created by haoqiang on 2015/7/23.
 */
public class FordFactory extends CarFactory {

    @Override
    public IWheel createWheel() {
        return new FordWheel();
    }

    @Override
    public IDoor createDoor() {
        return new FordDoor();
    }
}
