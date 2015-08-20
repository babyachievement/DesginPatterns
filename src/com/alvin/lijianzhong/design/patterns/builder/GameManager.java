package com.alvin.lijianzhong.design.patterns.builder;

import com.alvin.lijianzhong.design.patterns.builder.base.Builder;

/**
 * Created by babyachievement on 2015/8/17.
 * Director
 */
public class GameManager {
    private Builder builder;

    public GameManager(Builder builder)
    {
        this.builder = builder;
    }

    /**
     * 稳定的构建算法，不稳定的是子对象
     */
    public void construct()
    {
        /**
         * 这里建几扇门，几面墙，几扇窗是稳定的
         */
        builder.buildDoor();

        builder.buildWall();
        builder.buildWall();
        builder.buildWall();
        builder.buildWall();

        builder.buildWindows();
        builder.buildWindows();

        builder.buildHouseCeiling();
        builder.buildFloor();
    }
}
