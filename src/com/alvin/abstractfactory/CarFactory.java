package com.alvin.abstractfactory;

/**
 * Created by haoqiang on 2015/7/23.
 */
public abstract class CarFactory {
    public abstract  IDoor createDoor();
    public abstract IWheel createWheel();
}
