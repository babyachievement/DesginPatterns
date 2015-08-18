package com.alvin.lijianzhong.design.patterns.factorymethod;

/**
 * Created by babyachievement on 2015/8/18.
 */
public class TestFrame {
    CarFactory carFactory;
    public TestFrame(CarFactory carFactory)
    {
        this.carFactory = carFactory;
    }

    public void TestCar()
    {
        Car c1 = carFactory.CreateCar();

        c1.run();
        c1.stop();
        c1.turn(Direction.BACKWARD);
    }
}
