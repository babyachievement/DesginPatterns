package com.alvin.abstractfactory;

/**
 * Created by babyachievement on 2015/7/23.
 */
public class BydWheel implements  IWheel{
    @Override
    public boolean run() {
        System.out.println("比亚迪车轮跑起来");
        return  true;
    }
}
