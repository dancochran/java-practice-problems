package com.dsc.job.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// scope lifecycle to per class, default is per method and requires static setup
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RemoveDuplicatesFromSortedArrayTest 
{
    private RemoveDuplicatesFromSortedArray remdups;

    @BeforeAll
    public void setup()
    {
        remdups = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void testSingleElementArray()
    {
        final int[] singarr = {3};

        assertEquals(1, remdups.removeDuplicates(singarr));
    }

    @Test
    public void testOneValueTwoElementArray()
    {
        final int[] singarr = {3,3};

        assertEquals(1, remdups.removeDuplicates(singarr));
    }

    @Test
    public void testTwoValueTwoElementArray()
    {
        final int[] singarr = {3,4};

        assertEquals(2, remdups.removeDuplicates(singarr));
    }

    @Test
    public void testMultiElementArray()
    {
        final int[] singarr = {3,3,3,3,6,6,7,9,9,9,9,9,9,9,9,9,9,12,12,12,27,27,33,36,45,45,45,45,45,45,84,84,84};

        assertEquals(10, remdups.removeDuplicates(singarr));
    }
}
