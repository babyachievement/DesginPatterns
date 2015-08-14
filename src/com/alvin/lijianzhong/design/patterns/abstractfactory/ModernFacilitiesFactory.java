package com.alvin.lijianzhong.design.patterns.abstractfactory;

import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Building;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Jungle;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Road;
import com.alvin.lijianzhong.design.patterns.abstractfactory.base.Tunnel;
import com.alvin.lijianzhong.design.patterns.abstractfactory.modern.ModernBuilding;
import com.alvin.lijianzhong.design.patterns.abstractfactory.modern.ModernJungle;
import com.alvin.lijianzhong.design.patterns.abstractfactory.modern.ModernRoad;
import com.alvin.lijianzhong.design.patterns.abstractfactory.modern.ModernTunnel;

/**
 * Created by babyachievement on 2015/8/14.
 * 现代版
 */
public class ModernFacilitiesFactory extends FacilitiesFactory {
    @Override
    public Road createRoad() {
        return new ModernRoad();
    }

    @Override
    public Building createBuilding() {
        return new ModernBuilding();
    }

    @Override
    public Tunnel createTunnel() {
        return new ModernTunnel();
    }

    @Override
    public Jungle createJungle() {
        return new ModernJungle();
    }
}
