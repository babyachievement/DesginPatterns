package com.alvin.lijianzhong.design.patterns.builder.base;

/**
 * Created by babyachievement on 2015/8/17.
 */
public abstract class Builder {
    public abstract void buildDoor();
    public abstract void buildWall();
    public abstract void buildWindows();
    public abstract void buildHouseCeiling();
    public abstract void buildFloor();

    public abstract House getResult();

}
