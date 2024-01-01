package com.dsc.job.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// scope lifecycle to per class, default is per method and requires static setup
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BuySellStockTest 
{
    private BuySellStock buysellstock;

    @BeforeAll
    public void setup()
    {
        buysellstock = new BuySellStock();
    }

    @Test
    public void testTwoDayOneProfit()
    {
        final int[] prices = {1,2};

        assertEquals(1, buysellstock.maxProfit(prices));
    }

    @Test
    public void testMultiDay1()
    {
        final int[] prices = {7,1,5,3,6,4};

        assertEquals(7, buysellstock.maxProfit(prices));
    }

    @Test
    public void testMultiDay2()
    {
        final int[] prices = {1,2,3,4,5};

        assertEquals(4, buysellstock.maxProfit(prices));
    }

    @Test
    public void testMultiDay3()
    {
        final int[] prices = {7,6,4,3,1};

        assertEquals(0, buysellstock.maxProfit(prices));
    }

}
