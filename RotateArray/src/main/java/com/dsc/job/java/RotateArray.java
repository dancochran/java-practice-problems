package com.dsc.job.java;

import java.util.Arrays;

public class RotateArray
{

    public void rotateArray(int[] nums, int k) 
    {
        System.out.println("rotateArray running...");

        int newend = nums.length - k;
        int[] newarr = new int[nums.length];

        for (int i = 0; i < k; i++)
        {
            System.out.println("setting new pos " + i + " to value " + nums[i + k - 1]);
            newarr[i] = nums[i + newend];
        }

        for (int j = 0; j < newend; j++)
        {
            System.out.println("setting new pos " + (k+j) + " to value " + nums[j]);
            newarr[k + j] = nums[j];
        }

        System.out.println("NEW array = " + Arrays.toString(newarr));

        for (int n = 0; n < newarr.length; n++)
        {
            nums[n] = newarr[n];
        }
    }    

    public void rotateArrayInPlace(int[] nums, int k) 
    {
        System.out.println("rotateArrayInPlace running...");

        for (int i = 0; i < nums.length; i++)
        {
            // (pos + k) % length
            
        }

    }    

    public static void main(String[] args)
    {
        System.out.println("RotateArray running...");

        RotateArray rotate = new RotateArray();

        final int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
        rotate.rotateArray(nums,3);
        System.out.println("final array = " + Arrays.toString(nums));
    }

}


