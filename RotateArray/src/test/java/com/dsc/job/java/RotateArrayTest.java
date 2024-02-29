package com.dsc.job.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RotateArrayTest 
{
    private RotateArray rotate;

    @BeforeAll
    public void setup()
    {
        rotate = new RotateArray();
    }

    @Test
    public void testUnitArray()
    {
        final int[] nums = {1};

        assertEquals(1, nums.length);
    }


}
