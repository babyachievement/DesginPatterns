package com.alvin.lijianzhong.design.patterns.abstractfactory;

import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Building;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Jungle;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Road;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Tunnel;

/**
 * Created by babyachievement on 2015/8/14.
 * 抽象工厂
 */
public abstract class FacilitiesFactory {
    public abstract Road createRoad();
    public abstract Building createBuilding();
    public abstract Tunnel createTunnel();
    public abstract Jungle createJungle();
}
