package com.alvin.abstractfactory;

/**
 * Created by babyachievement on 2015/7/23.
 */
public class FordWheel implements IWheel{
    @Override
    public boolean run() {
        System.out.println("Ford Wheel run");
        return true;
    }
}
