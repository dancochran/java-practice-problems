package com.dsc.job.java;

public class RemoveDuplicatesFromSortedArray
{
    public int removeDuplicates(int[] nums)
    {
        int insertIndex = 1;

        for(int i = 1; i < nums.length; i++)
        {
            // skip to next index if this is a duplicate element
            if(nums[i - 1] != nums[i]) 
            {
                // Store the unique element at insertIndex index and increment the insertIndex by 1
                nums[insertIndex] = nums[i];     
                insertIndex++;
            }
        }

        return insertIndex;
    }
    public static void main(String[] args)
    {
        System.out.println("RemoveDuplicatesFromSortedArray running...");
    }

}


