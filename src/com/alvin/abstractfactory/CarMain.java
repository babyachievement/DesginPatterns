package com.alvin.abstractfactory;

/**
 * Created by babyachievement on 2015/7/23.
 */
public class CarMain {

    public static void main(String[] args) {
        CarFactory factory = new FordFactory();
        IDoor door = factory.createDoor();
        IWheel wheel = factory.createWheel();

        door.open();
        door.close();
        wheel.run();
    }
}
