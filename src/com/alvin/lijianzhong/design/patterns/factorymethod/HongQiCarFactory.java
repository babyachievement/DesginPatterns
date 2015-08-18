package com.alvin.lijianzhong.design.patterns.factorymethod;


/**
 * Created by babyachievement on 2015/8/18.
 */
public class HongQiCarFactory extends CarFactory {
    @Override
    public Car CreateCar() {
        return new HongQiCar();
    }
}
