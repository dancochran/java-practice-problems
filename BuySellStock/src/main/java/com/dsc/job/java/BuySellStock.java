package com.dsc.job.java;

public class BuySellStock
{
    public int maxProfit(int[] prices)
    {
        return calculate(prices, 0);
    }

    public int calculate(int prices[], int s) 
    {
        System.out.println("calculate running...");
        if (s >= prices.length) return 0;
        
        int max = 0;

        for (int start = s; start < prices.length; start++) 
        {
            for (int i = start + 1; i < prices.length; i++) 
            {
                if (prices[start] < prices[i]) 
                {
                    // this behavior (worst case) of calling recursively in a nested loop is 2^n (a binary tree is created)
                    // 2^n grows significantly faster than n^2 - see graph
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > max) max = profit;
                    // space complexity - The depth of the recursive call stack at any point is determined by the longest single path from the root call to the deepest call. 
                    // This depth does not depend on the total number of paths but on the longest sequential chain of calls.
                    // O(n) here (n - start reduces to n)
                }
            }
        }

        return max;
    }    

    public static void main(String[] args)
    {
        System.out.println("BuySellStock running...");

        BuySellStock buysellstock = new BuySellStock();

        final int[] prices = {1,2,3,4,5};
        int profit = buysellstock.maxProfit(prices);
        System.out.println("profit = " + profit);

        // 4 calls for 3, 8 calls for 4, 16 for 5, 
    }

}


