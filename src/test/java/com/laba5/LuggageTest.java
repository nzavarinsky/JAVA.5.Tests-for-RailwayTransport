package com.laba5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for com.laba5.Luggage Class
 * @author Nazarii Zavarynskyi
 * @version 1.0
 * @since 22.03.2017
 */
public class LuggageTest {
    Luggage luggage = new Luggage(1,2,3);
    @Test
    public void sumOfLuggage() throws Exception {
        Assert.assertEquals(235, luggage.sumOfLuggage());
    }

}