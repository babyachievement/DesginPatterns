package com.alvin.lijianzhong.design.patterns.singleton;

/**
 * Created by babyachievement on 2015/8/14.
 */
public class Singleton {
    private  volatile Singleton _instance;

    private Singleton()
    {}

    public Singleton get_instance()
    {
        if(null == _instance)
        {
            synchronized (Singleton.class)
            {
                if(null == _instance)
                {
                    _instance = new Singleton();
                }
            }
        }

        return _instance;
    }
}
