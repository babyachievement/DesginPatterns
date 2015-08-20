package com.alvin.lijianzhong.design.patterns.prototype;

/**
 * Created by babyachievement on 2015/8/20.
 */
public class GameSystem {
    public  static void run(NormalActor normalActor, FlyActor flyActor, WaterActor waterActor)
    {
        /*
        NormalActor normalActor1 = new NormalActor();
        NormalActor normalActor2 = new NormalActor();
        NormalActor normalActor3 = new NormalActor();
        NormalActor normalActor4 = new NormalActor();
        NormalActor normalActor5 = new NormalActor();

        FlyActor flyActor1 = new FlyActor();
        FlyActor flyActor2 = new FlyActor();

        WaterActor waterActor1 = new WaterActor();
        WaterActor waterActor2 = new WaterActor();
        */
        NormalActor normalActor1 = normalActor.clone();
        NormalActor normalActor2 = normalActor.clone();
        NormalActor normalActor3 = normalActor.clone();
        NormalActor normalActor4 = normalActor.clone();
        NormalActor normalActor5 = normalActor.clone();

        FlyActor flyActor1 = flyActor.clone();
        FlyActor flyActor2 = flyActor.clone();

        WaterActor waterActor1 = waterActor.clone();
        WaterActor waterActor2 = waterActor.clone();
    }
}
