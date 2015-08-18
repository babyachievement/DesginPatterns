package com.alvin.lijianzhong.design.patterns.factorymethod;

/**
 * Created by babyachievement on 2015/8/18.
 */
public class App {

    public static void main(String[] args) {
        TestFrame tf = new TestFrame(new HongQiCarFactory());
        tf.TestCar();
    }
}
