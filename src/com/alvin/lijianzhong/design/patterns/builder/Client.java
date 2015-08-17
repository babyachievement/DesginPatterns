package com.alvin.lijianzhong.design.patterns.builder;

import com.alvin.lijianzhong.design.patterns.builder.base.House;
import com.alvin.lijianzhong.design.patterns.builder.rome.RomeBuilder;

/**
 * Created by babyachievement on 2015/8/17.
 */
public class Client {
    public static void main(String[] args) {
        RomeBuilder builder = new RomeBuilder();
        GameManager gameManager = new GameManager(builder);

        gameManager.construct();
        House house = builder.getResult();
    }
}
