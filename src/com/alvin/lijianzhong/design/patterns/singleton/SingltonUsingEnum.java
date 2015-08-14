package com.alvin.lijianzhong.design.patterns.singleton;

/**
 * Created by babyachievement on 2015/8/14.
 */
public enum SingltonUsingEnum {
    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SingltonUsingEnum{" +
                "name='" + name + '\'' +
                '}';
    }
}
