package com.alvin.abstractfactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by babyachievement on 2015/7/23.
 */
public class FordFactoryTest {
    private FordFactory fordFactory;

    @BeforeMethod
    public void setUp() throws Exception {
        fordFactory = new FordFactory();
    }

    @Test
    public void testCreateWheel() throws Exception {
        IWheel wheel = fordFactory.createWheel();
        assertEquals(true, wheel.run());
    }

    @Test
    public void testOpenDoor() throws Exception {
        IDoor door = fordFactory.createDoor();
        assertEquals(true, door.open());

    }

    @Test
    public void testCloseFordDoor() throws Exception {
        IDoor door = fordFactory.createDoor();
        assertEquals(true, door.close());

    }
}