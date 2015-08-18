package com.alvin.lijianzhong.design.patterns.factorymethod;

/**
 * Created by babyachievement on 2015/8/18.
 */
public class HongQiCar extends Car{

    @Override
    public void run() {
        System.out.println("Hoqing Car run");
    }

    @Override
    public void stop() {
        System.out.println("Hoqing Car stop");
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("HongQi Car turn "+ direction);
    }
}
