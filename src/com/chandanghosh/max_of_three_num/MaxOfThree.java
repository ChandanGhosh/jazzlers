package com.chandanghosh.max_of_three_num;

public class MaxOfThree
{
    public static int maxOfThree(int a, int b, int c)
    {
        return (a > b ? (a > c) ? a : c : (b > c) ? b : c);
    }

    public static void main(String[] args)
    {
        System.out.println(maxOfThree(18, 14, 11));
    }
}

