package com.chandanghosh.fibonacci;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println(fibonacci(5));
    }

    static int fibonacci(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        return n + fibonacci(n - 1);
    }
}
