package com.laba5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Tests for com.laba5.Manager Class
 * @author Nazarii Zavarynskyi
 * @version 1.0
 * @since 22.03.2017
 */
public class ManagerTest {

    Manager mg = new Manager();

    @Test
    public void createPassengersTrain() throws Exception {
        mg.createPassengersTrain();
        Assert.assertEquals(1, mg.passengersTrains.size());
    }

    @Test
    public void createLocomotive() throws Exception {
        mg.createLocomotive();
        Assert.assertEquals(1, mg.locomotives.size());
    }

    @Test
    public void createCargo() throws Exception {
        mg.creatCargo();
        Assert.assertEquals(1,mg.cargo.size());
    }

    @Test
    public void sortTrainsByPassengers() throws Exception {
        mg.sortTrainsByPassengers();
        for (int i=1; i<mg.train.size(); i++)
        {
            assertTrue(mg.train.get(i).getNumOfPassengers()<=mg.train.get(i-1).getNumOfPassengers());
        }
    }

}