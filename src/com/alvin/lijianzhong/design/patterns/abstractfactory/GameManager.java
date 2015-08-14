package com.alvin.lijianzhong.design.patterns.abstractfactory;

import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Building;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Jungle;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Road;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Tunnel;

/**
 * Created by babyachievement on 2015/8/14.
 * 客户端程序
 */
public class GameManager {
    FacilitiesFactory facilitiesFactory;

    public  GameManager(FacilitiesFactory facilitiesFactory)
    {
        this.facilitiesFactory = facilitiesFactory;
    }

    public void buildGameFacilities()
    {
        Road road = facilitiesFactory.createRoad();
        Building building = facilitiesFactory.createBuilding();
        Tunnel tunnel = facilitiesFactory.createTunnel();
        Jungle jungle = facilitiesFactory.createJungle();
    }
}
