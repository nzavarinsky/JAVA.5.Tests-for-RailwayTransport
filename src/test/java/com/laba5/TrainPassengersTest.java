package com.laba5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for com.laba5.TrainPassengers Class
 * @author Nazarii Zavarynskyi
 * @version 1.0
 * @since 22.03.2017
 */
public class TrainPassengersTest {
    TrainPassengers trainPassengers = new TrainPassengers(1,3,5);
    @Test
    public void passengers() throws Exception {
        Assert.assertEquals(376,trainPassengers.Passengers());
    }

}